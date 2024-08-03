package xyz.aeonxd.customfont.api.font

import xyz.aeonxd.customfont.plugin.font.DefaultFont

abstract class Font {

    abstract val id: String
    abstract val translationMap: TranslationMap

    companion object {
        @JvmStatic
        val DEFAULT: Font = DefaultFont
    }

}