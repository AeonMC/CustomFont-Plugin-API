package me.aeon.customfont.api.data

import dev.dejvokep.boostedyaml.YamlDocument
import me.aeon.customfont.api.font.CustomFont
import me.aeon.customfont.api.font.FontManager
import java.util.*

abstract class PlayerDataManager {

    abstract val dataFile: YamlDocument
    abstract val playerData: MutableMap<UUID, CustomFont>
    abstract val fontManager: FontManager

    /**
     * Loads data from disk
     */
    abstract fun loadData(): MutableMap<UUID, CustomFont>

    /**
     * Gets from [online player data][playerData] map
     */
    abstract operator fun get(uuid: UUID): CustomFont?

    /**
     * Gets from disk
     */
    abstract fun fromDisk(uuid: UUID): CustomFont?

    /**
     * Used when setting a new custom chat font or
     * when a player with a previous font set is joining the server
     */
    abstract operator fun set(uuid: UUID, font: CustomFont)

    /**
     * Removes from [online player data][playerData] map
     */
    abstract fun unset(uuid: UUID)

    /**
     * Deletes from [data file][dataFile]
     */
    abstract fun reset(uuid: UUID, saveFile: Boolean)

    /**
     * Whether a [UUID] is in the [online player data][playerData] map
     */
    abstract operator fun contains(uuid: UUID): Boolean

    /**
     * Whether a [UUID] is in the [data file][dataFile]
     */
    abstract fun isSaved(uuid: UUID): Boolean

    /**
     * Retrieves all saved UUIDs
     */
    abstract fun allUUIDs(): Set<UUID>

    /**
     * Saves the [data file][dataFile] contents to disk
     */
    abstract fun saveFile()

}