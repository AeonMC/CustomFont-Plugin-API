package me.aeon.customfont.api.font

import me.aeon.customfont.plugin.font.CustomFontImpl

interface CustomFont : Font {
    val permission: String?

    class Builder : AbstractBuilder by CustomFontImpl.Builder()

    interface AbstractBuilder {
        fun id(fontId: String): AbstractBuilder
        fun permission(permission: String?): AbstractBuilder
        fun characters(chars: Pair<String, String>): AbstractBuilder
        fun build(): CustomFont
    }

}