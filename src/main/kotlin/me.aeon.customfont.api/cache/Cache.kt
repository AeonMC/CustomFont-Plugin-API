package me.aeon.customfont.api.cache

import me.aeon.customfont.api.font.Font

interface Cache {
    val originalText: String
    val font: Font
}