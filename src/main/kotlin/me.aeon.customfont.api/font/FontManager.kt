package me.aeon.customfont.api.font

abstract class FontManager {

    abstract val fontMap: Map<String, CustomFont>
    abstract val fontIds: List<String>
    abstract val fonts: List<CustomFont>

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
     * Returns a [CustomFont], otherwise `null`
     *
     * Takes [useCaseSensitivity] into consideration
     */
    abstract fun fromId(id: String): CustomFont?

}