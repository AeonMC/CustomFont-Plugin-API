package xyz.aeonxd.customfont.api.extensions

import xyz.aeonxd.customfont.api.font.CustomFont
import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.OfflinePlayer
import org.bukkit.command.CommandSender

/**
 * Returns a list of [CustomFont]s which the [sender] has access to
 *
 * Checked with `CommandSender#hasPermission(CustomFont#permission)`
 */
fun List<CustomFont>.filterByPermission(sender: CommandSender) =
    this.filter {
            it.permission
                ?.let { permission ->
                    sender.hasPermission(permission)
                }
                ?: true
        }

/**
 * Applies [PlaceholderAPI] placeholders to [this][String]
 */
fun String.applyPlaceholders(viewer: OfflinePlayer? = null) =
    PlaceholderAPI.setPlaceholders(viewer, this)

/**
 * Applies [PlaceholderAPI] bracket placeholders to [this][String]
 */
fun String.applyBracketPlaceholders(viewer: OfflinePlayer? = null) =
    PlaceholderAPI.setBracketPlaceholders(viewer, this)