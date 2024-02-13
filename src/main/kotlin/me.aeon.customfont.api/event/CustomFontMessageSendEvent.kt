package me.aeon.customfont.api.event

import me.aeon.customfont.api.font.CustomFont
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Event that is fired whenever a message with an active custom font is being sent
 * NOTE: May not work with asynchronous event listeners (such as the default message send listener or AsyncPlayerChatEvent)
 *
 * @param player Who sent the message
 * @param oldMessage The old message
 * @param newMessage The new message (converted)
 * @param font The font being used
 */
class CustomFontMessageSendEvent(
    val player: Player?,
    val oldMessage: String,
    var newMessage: String,
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