package xyz.aeonxd.customfont.api.data

import xyz.aeonxd.customfont.api.CustomFontPluginAPI
import org.bukkit.entity.Player
import java.util.*

abstract class CommandCooldownManager {

    private val cooldowns = mutableMapOf<UUID, Long>()
    private val cooldownInSeconds = CustomFontPluginAPI.instance.configParser.fontSetCooldown()

    /**
     * Add this player into the [cooldowns] map
     */
    abstract fun add(uuid: UUID, timeStamp: Long)


    /**
     * Returns true if the player has the bypass permission "customfont.user.set.bypasscooldown"
     */
    abstract fun isInCooldown(player: Player): Boolean

    /**
     * Returns how many seconds the player has left in cooldown
     * Returns -1 if not in cooldown
     */
    abstract fun secondsLeft(uuid: UUID): Int

}