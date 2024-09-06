package xyz.aeonxd.customfont.api.data.bulkhandler

enum class FilterType(val identifier: String) {
    ONLINE("*"), OFFLINE("**"), ALL("***");

    companion object {
        private val identifiers by lazy { entries.associateBy { it.identifier } }

        fun of(input: String): FilterType? = identifiers[input]
    }
}