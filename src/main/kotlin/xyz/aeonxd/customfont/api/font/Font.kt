package xyz.aeonxd.customfont.api.font

import xyz.aeonxd.customfont.plugin.font.DefaultFont

interface Font {
    val id: String
    val characters: Pair<String, String>
    val translationMap: Map<Char, String>
    fun setupTranslationMap(): Map<Char, String>

    object DEFAULT : Font by DefaultFont
}