package me.aeon.customfont.api.font

import dev.dejvokep.boostedyaml.block.implementation.Section

/**
 * Character types from **fonts.yml**
 *
 * @param path Path to access it in a characters [section][Section]
 * @param default Default characters
 */
enum class CharacterType(private val path: String, val default: String) {

    UPPERCASE("uppercase", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    LOWERCASE("lowercase", "abcdefghijklmnopqrstuvwxyz"),
    NUMBER("numbers", "0123456789"),
    SPECIAL("special", "?!@#$%^*()_-+=");

    /* Character limit */
    val limit = default.length

    /**
     * @param characterSection Section to get value from
     */
    fun getOrDefault(characterSection: Section): String {
        val chars = characterSection.getString(path) ?: default

        return if (chars.length < limit) default
        else chars
    }

}