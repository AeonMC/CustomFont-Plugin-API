package xyz.aeonxd.customfont.api.data.bulkhandler

data class BulkProcessEntryResult(
    private val type: BulkProcessResult.Type,
    val entries: Int
) : BulkProcessResult {
    override fun get() = type
}