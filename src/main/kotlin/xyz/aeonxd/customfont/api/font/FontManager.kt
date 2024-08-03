package xyz.aeonxd.customfont.api.font

import xyz.aeonxd.customfont.api.CustomFontPluginAPI

abstract class FontManager {

    val fontMap: Map<String, CustomFont> by lazy { loadFonts() }
    val fontIds: List<String> by lazy { fontMap.keys.toList() }
    val fonts: List<CustomFont> by lazy { fontMap.values.toList() }

    /**
     * Whether to use case sensitivity when looking
     * for a [CustomFont] with [fromId]
     */
    abstract val useCaseSensitivity: Boolean

    /**
     * Loads fonts from disk
     */
    abstract fun loadFonts(): Map<String, CustomFont>

    /**
     * Returns a [CustomFont] if it exists, otherwise `null`.
     *
     * Takes [useCaseSensitivity] into consideration
     */
    abstract fun fromId(id: String): CustomFont?

    /**
     * Writes the [font] to fonts.yml
     * Save the fonts with [saveNewFonts] and then reload the plugin
     * with [CustomFontPluginAPI.reload] to retrieve them with FontManager.
     */
    abstract fun addFont(font: CustomFont): Boolean

    /**
     * Saves the newly written fonts from [addFont]. Reload
     * the plugin with [CustomFontPluginAPI.reload] to retrieve them with FontManager.
     */
    abstract fun saveNewFonts(): Boolean

}