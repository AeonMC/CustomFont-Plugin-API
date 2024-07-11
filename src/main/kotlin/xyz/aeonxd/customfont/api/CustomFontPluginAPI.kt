package xyz.aeonxd.customfont.api

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import xyz.aeonxd.commonslib.commands.MessageParserProvider
import xyz.aeonxd.commonslib.commands.MessageSenderProvider
import xyz.aeonxd.commonslib.message.MessageParser
import xyz.aeonxd.commonslib.message.MessageSender
import xyz.aeonxd.commonslib.scheduler.TaskScheduler
import xyz.aeonxd.customfont.api.config.ConfigParser
import xyz.aeonxd.customfont.api.data.PlayerDataManager
import xyz.aeonxd.customfont.api.data.PlayerDataRemovalService
import xyz.aeonxd.customfont.api.font.FontManager

abstract class CustomFontPluginAPI : JavaPlugin(), TaskScheduler, MessageSenderProvider, MessageParserProvider {

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


    companion object {
        @JvmStatic
        lateinit var instance: CustomFontPluginAPI

        @JvmStatic
        val pluginManager = Bukkit.getPluginManager()

        @JvmStatic
        fun isPluginEnabled(name: String) = Bukkit.getPluginManager().isPluginEnabled(name)
    }

}