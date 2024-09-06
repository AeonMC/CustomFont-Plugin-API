package xyz.aeonxd.customfont.api.data.bulkhandler

interface PlayerBulkDataManagers {
    val additionService: BulkProcessor
    val removalService: BulkProcessor
}