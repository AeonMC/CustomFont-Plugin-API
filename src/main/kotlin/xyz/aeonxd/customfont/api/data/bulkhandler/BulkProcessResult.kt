package xyz.aeonxd.customfont.api.data.bulkhandler

fun interface BulkProcessResult {
    enum class Type {
        SUCCESS, AWAITING_CONFIRMATION
    }

    fun get(): Type
}