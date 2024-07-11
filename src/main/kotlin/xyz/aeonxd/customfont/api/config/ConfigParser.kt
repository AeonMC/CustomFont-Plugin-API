package xyz.aeonxd.customfont.api.config

import dev.dejvokep.boostedyaml.block.implementation.Section
import dev.respark.licensegate.LicenseGate.ValidationType
import org.bukkit.event.EventPriority
import xyz.aeonxd.commonslib.config.parser.ValueParser
import java.util.concurrent.CompletableFuture
import kotlin.time.Duration

abstract class ConfigParser : ValueParser {

    override val viewer = null

    open val config: Section
        get() = section ?: throw IllegalStateException("Could not find config.yml")

    abstract fun isValid(): CompletableFuture<Pair<ValidationType, Long>>

    abstract fun checkForUpdates(): Boolean
    abstract fun checkInterval(): Duration

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