package xyz.aeonxd.customfont.api.cache

import xyz.aeonxd.customfont.api.font.Font

class CompleteCache(
    override val originalText: String,
    override val font: Font,
    val convertedText: String
) : Cache {

    constructor(incompleteCache: IncompleteCache, convertedText: String) : this(
        incompleteCache.originalText,
        incompleteCache.font,
        convertedText
    )

}