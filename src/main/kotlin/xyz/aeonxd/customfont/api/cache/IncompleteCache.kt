package xyz.aeonxd.customfont.api.cache

import xyz.aeonxd.customfont.api.font.Font

data class IncompleteCache(
    override val originalText: String,
    override val font: Font
) : Cache