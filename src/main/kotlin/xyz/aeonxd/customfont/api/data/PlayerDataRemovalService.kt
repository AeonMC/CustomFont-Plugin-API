package xyz.aeonxd.customfont.api.data

import xyz.aeonxd.customfont.api.data.PlayerDataRemovalService.Result.*

abstract class PlayerDataRemovalService {

    abstract val confirmationTimers: MutableMap<RemoveType, Long>

    /**
     * Processes data removal
     */
    abstract fun process(input: String): Result

    /**
     * Requests confirmation to the command sender
     */
    protected abstract fun requestConfirmation(removeType: RemoveType): Result

    /**
     * Removes data
     *
     * Returns number of entries removed
     */
    protected abstract fun removeData(removeType: RemoveType): Int


    enum class RemoveType(
        private val char: String
    ) {
        ONLINE("*"), OFFLINE("**"), ALL("***");

        companion object {
            private val identifiers = entries.associateBy { it.char }

            fun fromString(input: String) = identifiers[input]
        }
    }

    fun interface Result {
        enum class Type {
            SUCCESS, AWAITING_CONFIRMATION
        }

        fun get(): Type
    }

    class EntryResult(private val type: Type, val entries: Int) : Result {
        override fun get() = type
    }
}