package me.aeon.customfont.api.cache

import me.aeon.customfont.expansion.cache.CacheManagerImpl


interface CacheManager {

    /**
     * Whether the [text] is suitable for caching
     *
     * NOTE: Placeholders should not be cached
     */
    fun isCacheable(text: String): Boolean

    /**
     * Whether the [incompleteCache] is cached
     */
    operator fun contains(incompleteCache: IncompleteCache): Boolean

    /**
     * Retrieves the [CompleteCache], otherwise `null`
     */
    fun get(incompleteCache: IncompleteCache): CompleteCache?

    /**
     * Adds an [incompleteCache] to the cache
     */
    fun addToCache(incompleteCache: IncompleteCache, completeCache: CompleteCache)

    /**
     * Clears the cache
     */
    fun clearCache()

    companion object : CacheManager by CacheManagerImpl.Implementation

}