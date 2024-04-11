package me.aeon.customfont.api.font

import me.aeon.customfont.plugin.font.CustomFontImpl

interface CustomFont : Font {
    val permission: String?

    class Builder : AbstractBuilder by CustomFontImpl.Builder()

    interface AbstractBuilder {
        var id: String
        var permission: String?
        var characters: MutableMap<CharacterType, String?>

        fun id(fontId: String): AbstractBuilder
        fun permission(permission: String?): AbstractBuilder
        fun characters(characterType: CharacterType, characters: String): AbstractBuilder
        fun build(): CustomFont
    }

}