package xyz.aeonxd.customfont.api.font

import xyz.aeonxd.customfont.plugin.font.CustomFontImpl

abstract class CustomFont : Font() {
    abstract val permission: String?

    class Builder : AbstractBuilder by CustomFontImpl.Builder()

    interface AbstractBuilder {
        fun id(fontId: String): AbstractBuilder
        fun permission(permission: String?): AbstractBuilder
        fun addCharacters(characterType: CharacterType, chars: Pair<String, String>): AbstractBuilder
        fun setAllCharacters(characters: Map<CharacterType, Pair<String, String>>): AbstractBuilder
        fun build(): CustomFont
    }
}