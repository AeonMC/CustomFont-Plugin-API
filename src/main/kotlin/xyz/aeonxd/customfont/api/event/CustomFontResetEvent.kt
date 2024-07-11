package xyz.aeonxd.customfont.api.event

import xyz.aeonxd.customfont.api.font.CustomFont
import org.bukkit.OfflinePlayer
import org.bukkit.command.CommandSender
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Event that is fired whenever a custom font is being reset
 *
 * @param sender Who reset the font
 * @param player Who the font is being reset for
 * @param font The old font
 */
class CustomFontResetEvent(
    val sender: CommandSender,
    val player: OfflinePlayer,
    val font: CustomFont,
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