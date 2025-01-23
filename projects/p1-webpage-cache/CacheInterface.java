/**
 * TODO - complete the summary javadoc for the class here.
 * @author CS321 Instructors
 */

public interface CacheInterface<K, V extends KeyInterface<K>> {

    /**
     * gets a value from cache by key
     * @param key key used to get value
     * @return value associated with the key
     */
    public V get(K key);{
    return cache.get(key);
    }

    /**
     * gives a value to the cache. Existing value will be replaced.
     * @param value value added to cache.
     * @return returns previous value.
     */
    public V add(V value);{
    return cache.put(value.getKey(), value);
}

    /**
     * removes a value from cache by key.
     * @param key identifier for value that will be removed.
     * @return removed value
     */
    public V remove(K key); {
    return cache.remove(key);
}
    /**
     * clears cache entries
     */
    public void clear(); {
        cache.clear();
    }

    /**
     * {@inheritDoc} 
     */
    public String toString();
}
