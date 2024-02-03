package me.aeon.customfont.api.font

import me.aeon.customfont.plugin.font.TextTranslatorImpl
import me.aeon.customfont.api.cache.CacheManager
import org.bukkit.OfflinePlayer

interface TextTranslator {

    /**
     * Replaces the characters in the [text] with the font's [translation map][Font.translationMap]
     */
    fun translate(text: String, font: CustomFont): String

    /**
     * Replaces the characters in the [text] with the font's [translation map][Font.translationMap]
     */
    fun translate(text: String, font: CustomFont, viewer: OfflinePlayer?): String

    /**
     * Replaces the characters in the [text] with the font's [translation map][Font.translationMap]
     */
    fun translate(text: String, font: CustomFont, viewer: OfflinePlayer?, parseBracketPlaceholders: Boolean): String

    /**
     * Replaces the characters in the [text] with the font's [translation map][Font.translationMap]
     *
     * Caches the result for the duration of the plugin
     * @see CacheManager
     */
    fun translateAndCache(text: String, font: CustomFont, viewer: OfflinePlayer?): String

    /* Not implemented yet */
    // fun untranslate(text: String, font: CustomFont): String

    companion object : TextTranslator by TextTranslatorImpl.Implementation

}