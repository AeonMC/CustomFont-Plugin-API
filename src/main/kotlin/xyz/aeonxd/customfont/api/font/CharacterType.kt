package xyz.aeonxd.customfont.api.font

import dev.dejvokep.boostedyaml.block.implementation.Section

/**
 * Character types from fonts.yml
 *
 * @param route Path to access the replacement in a characters section
 * @param default Default characters
 */
enum class CharacterType(val route: String, val default: String) {

    UPPERCASE("uppercase", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    LOWERCASE("lowercase", "abcdefghijklmnopqrstuvwxyz"),
    NUMBER("numbers", "0123456789"),
    SPECIAL("special", "?!@#$%^*()_-+="),
    OTHER("other.replace", "");

    /* Character limit */
    val limit = default.length

    /**
     * @param characterSection Section to get value from
     */
    fun getOrDefault(characterSection: Section): String {
        val chars = characterSection.getString(route) ?: default

        return if (chars.length < limit) default
        else chars
    }

    companion object {
        val totalLength = entries.sumOf { it.limit }
    }

}