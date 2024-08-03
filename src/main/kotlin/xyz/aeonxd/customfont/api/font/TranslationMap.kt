package xyz.aeonxd.customfont.api.font

@Suppress("UNUSED")
abstract class TranslationMap {

    abstract val extensiveMap: Map<CharacterType, Pair<String, String>>
    abstract val charStringMap: Map<Char, String>

    open val characterPair: Pair<String, String> by lazy {
        extensiveMap.values.joinToString("") { it.first } to
                extensiveMap.values.joinToString("") { it.second }
    }

}
