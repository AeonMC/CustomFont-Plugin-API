package xyz.aeonxd.customfont.api.cache

import xyz.aeonxd.customfont.api.font.Font

interface Cache {
    val originalText: String
    val font: Font
}