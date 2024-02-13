package me.aeon.customfont.api.config

import dev.dejvokep.boostedyaml.YamlDocument
import org.bukkit.event.EventPriority

abstract class ConfigParser {

    abstract val config: YamlDocument
    abstract val valid: Pair<Long, Boolean>

    abstract fun defaultFont(): String
    abstract fun fontSetCooldown(): Int
    abstract fun useCaseSensitivity(): Boolean
    abstract fun translateFontNameOnSet(): Boolean
    abstract fun translationPriority(): EventPriority

    abstract fun ignoredKeywords(): List<String>

    /* PlaceholderAPI Expansion */
    abstract fun returnTextIfFontInvalid(): Boolean

    /* Essentials */
    abstract fun translateEssentialsPrivateMessage(): Boolean
    abstract fun translateEssentialsMailMessage(): Boolean

    /* LuckPerms */
    abstract fun isPerGroupFontsEnabled(): Boolean
    abstract fun perGroupFonts(): Map<String, String>

    /* DiscordSRV */
    abstract fun translateMinecraftToDiscordMessage(): Boolean
    abstract fun defaultDiscordSRVFont(): String

}