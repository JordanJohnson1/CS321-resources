/**
 * Interface for a cache that supports basic operations.
 * 
 * @param <K> The type of keys used in cache.
 * @param <V> the type of values stored in cache.
 */
public interface CacheInterface<K, V extends KeyInterface<K>> {

    /**
     * gets a value from the cache by key.
     * 
     * @param key The key used to retrieve the value.
     * @return The value associated with the key.
     */
    public V get(K key);

    /**
     * Adds a value to the cache. If the key already exists, the existing value will be replaced.
     * If the cache reaches its capacity, the least recently used item will be evicted.
     * 
     * @param value The value to be added to the cache.
     * @return The previous value associated with the key, or null if there was no previous value.
     */
    public V add(V value);

    /**
     * Removes a value from the cache by its key.
     * 
     * @param key The key used to remove the value.
     * @return The value that was removed, or null if no value was associated with the key.
     */
    public V remove(K key);

    /**
     * Clears all entries in the cache.
     */
    public void clear();

    /**
     * Provides a string representation of the cache contents.
     * 
     * @return A string representing the cache.
     */
    public String toString();

    /**
     * Returns the current cache hit count.
     * 
     * @return The number of cache hits.
     */
    public int getHitCount();

    /**
     * Returns the current cache miss count.
     * 
     * @return The number of cache misses.
     */
    public int getMissCount();

    /**
     * Returns the total number of accesses (hits + misses).
     * 
     * @return The total number of cache accesses.
     */
    public int getAccessCount();

    /**
     * Returns the current cache hit ratio (hitCount / accessCount).
     * 
     * @return The cache hit ratio.
     */
    public double getHitRatio();

    /**
     * Returns the current eviction count.
     * 
     * @return The number of evictions that have occurred.
     */
    public int getEvictionCount();
}
