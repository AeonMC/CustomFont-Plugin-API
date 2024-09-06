package xyz.aeonxd.customfont.api.data.bulkhandler

abstract class BulkProcessor {

    private val confirmationTimers = mutableMapOf<FilterType, Long>()

    abstract fun handle(filterType: FilterType, vararg args: Any?): Int

    fun process(input: String, vararg args: Any?): BulkProcessResult {
        val filterType = FilterType.of(input)!!

        return if (filterType in confirmationTimers) {
            /*
             * Has requested removal at some point but never confirmed
             * Check if within 15 seconds
            */
            val then = confirmationTimers[filterType]!! / 1000
            val now = System.currentTimeMillis() / 100
            val hasExpired = (now - then).toInt() > 15

            if (hasExpired) {
                requestConfirmation(filterType)
            } else {
                confirmationTimers.remove(filterType)
                BulkProcessEntryResult(BulkProcessResult.Type.SUCCESS, handle(filterType, *args))
            }
        } else {
            requestConfirmation(filterType)
        }
    }

    private fun requestConfirmation(filterType: FilterType): BulkProcessResult {
        confirmationTimers[filterType] = System.currentTimeMillis()
        return BulkProcessResult { BulkProcessResult.Type.AWAITING_CONFIRMATION }
    }

}