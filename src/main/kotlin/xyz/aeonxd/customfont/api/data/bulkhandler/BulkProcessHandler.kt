package xyz.aeonxd.customfont.api.data.bulkhandler

import org.bukkit.command.CommandSender

interface BulkProcessHandler {
    fun isBulkProcess(input: String) = input in FilterType.entries.map { it.identifier }
    fun handleBulkProcess(sender: CommandSender, args: Array<out String>): Boolean
}