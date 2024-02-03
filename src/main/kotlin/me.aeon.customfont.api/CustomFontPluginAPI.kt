package me.aeon.customfont.api

import me.aeon.customfont.api.config.ConfigParser
import me.aeon.customfont.api.data.PlayerDataManager
import me.aeon.customfont.api.data.PlayerDataRemovalService
import me.aeon.customfont.api.font.FontManager
import me.aeon.customfont.libs.commons.commands.MessageParserProvider
import me.aeon.customfont.libs.commons.commands.MessageSenderProvider
import me.aeon.customfont.libs.commons.message.MessageParser
import me.aeon.customfont.libs.commons.message.MessageSender

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

abstract class CustomFontPluginAPI : JavaPlugin(), MessageSenderProvider, MessageParserProvider {

    abstract var configParser: ConfigParser
        protected set
    abstract var fontManager: FontManager
        protected set

    abstract override var messageParser: MessageParser
        protected set
    abstract override var messageSender: MessageSender
        protected set

    abstract var playerDataManager: PlayerDataManager
        protected set
    abstract var playerDataRemovalService: PlayerDataRemovalService
        protected set

    abstract fun reload()

    abstract fun registerCommand(name: String, commandExecutor: CommandExecutor)
    abstract fun registerListener(listener: Listener)
    abstract fun unregisterListener(listener: Listener)
    abstract fun unregisterListeners()

    abstract fun runTask(task: () -> Unit)
    abstract fun runTaskLater(delay: Long, task: () -> Unit)

    companion object {
        @JvmStatic
        lateinit var INSTANCE: CustomFontPluginAPI

        @JvmStatic
        val pluginManager = Bukkit.getPluginManager()

        @JvmStatic
        fun isPluginEnabled(name: String) = pluginManager.isPluginEnabled(name)
    }
}