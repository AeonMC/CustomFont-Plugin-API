package me.aeon.customfont.api.config

import dev.dejvokep.boostedyaml.YamlDocument

abstract class ConfigParser {

    abstract val config: YamlDocument
    abstract val valid: Pair<Long, Boolean>

    abstract fun defaultFont(): String
    abstract fun fontSetCooldown(): Int
    abstract fun useCaseSensitivity(): Boolean
    abstract fun translateFontNameOnSet(): Boolean

    /* PlaceholderAPI Expansion */
    abstract fun returnTextIfFontInvalid(): Boolean

    abstract fun translateEssentialsPrivateMessage(): Boolean
    abstract fun translateEssentialsMailMessage(): Boolean

    abstract fun ignoredKeywords(): List<String>

}