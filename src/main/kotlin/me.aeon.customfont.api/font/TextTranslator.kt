package me.aeon.customfont.api.font

import me.aeon.customfont.plugin.font.TextTranslatorImpl
import org.bukkit.OfflinePlayer

interface TextTranslator {

    fun translate(text: String, font: CustomFont): String
    fun translate(text: String, font: CustomFont, viewer: OfflinePlayer?, parseBracketPlaceholders: Boolean): String
    fun translateAndCache(text: String, font: CustomFont, viewer: OfflinePlayer?): String
    fun untranslate(text: String, font: CustomFont): String

    companion object : TextTranslator by TextTranslatorImpl.Implementation

}