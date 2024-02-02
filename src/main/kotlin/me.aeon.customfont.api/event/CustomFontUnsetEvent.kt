package me.aeon.customfont.api.event

import me.aeon.customfont.api.font.CustomFont
import org.bukkit.OfflinePlayer
import org.bukkit.command.CommandSender
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Event that is fired whenever a custom font is being unset
 *
 * This event should only fired whenever a player with an active
 * custom font leaves the server
 *
 * @param sender Who unset the font
 * @param player Who the font is being unset for
 * @param font The font being unset
 */
class CustomFontUnsetEvent(
    val sender: CommandSender,
    val player: OfflinePlayer,
    var font: CustomFont
) : Event(), Cancellable {

    private var isCancelled: Boolean = false

    override fun isCancelled() = isCancelled

    override fun setCancelled(cancel: Boolean) {
        isCancelled = cancel
    }

    override fun getHandlers() = handlerList

    companion object {
        private val handlerList = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList = handlerList
    }

}