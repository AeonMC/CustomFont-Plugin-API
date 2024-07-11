package xyz.aeonxd.customfont.api.event

import xyz.aeonxd.customfont.api.font.CustomFont
import xyz.aeonxd.customfont.api.font.Font
import org.bukkit.OfflinePlayer
import org.bukkit.command.CommandSender
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Event that is fired whenever a custom font is being set
 *
 * @param sender Who set the font
 * @param player Who the font is being set for
 * @param oldFont The old font
 * @param newFont The font being set
 */
class CustomFontSetEvent(
    val sender: CommandSender,
    val player: OfflinePlayer,
    val oldFont: Font,
    var newFont: CustomFont
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