package xyz.aeonxd.customfont.api.cache

import xyz.aeonxd.customfont.api.font.Font

class IncompleteCache(
    override val originalText: String,
    override val font: Font
) : Cache {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        return if (other !is IncompleteCache) false
        else originalText == other.originalText && font == other.font
    }

    override fun hashCode(): Int {
        var result = originalText.hashCode()
        result = 31 * result + font.hashCode()
        return result
    }

}