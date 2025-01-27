import java.util.*;

public class Cache<K, V extends KeyInterface<K>> {

    private final int maxSize;
    private final LinkedHashMap<K, V> cacheMap;
    private int hitCount = 0;
    private int missCount = 0;

    public Cache(int maxSize) {
        this.maxSize = maxSize;
        this.cacheMap = new LinkedHashMap<>(maxSize, 0.75f, true); 
    }

    // reset hit & miss count
    public void resetCounts() {
        hitCount = 0;
        missCount = 0;
    }

    // get cache value
    public V get(K key) {
        V value = cacheMap.get(key);
        if (value != null) {
            hitCount++; 
        } else {
            missCount++;  
        }
        return value;
    }

    // add cache value
    public V add(V value) {
        if (cacheMap.size() >= maxSize) {
            evict(); 
        }
        return cacheMap.put(value.getKey(), value);
    }

    // removes cache value
    public V remove(K key) {
        return cacheMap.remove(key);
    }

    // reset count & clear cache
    public void clear() {
        cacheMap.clear();
        hitCount = 0;  
        missCount = 0; 
    }

    // Return the cache contents
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : cacheMap.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }

    // get hit count
    public int getHitCount() {
        return hitCount;
    }

    // get miss count
    public int getMissCount() {
        return missCount;
    }

    // evicts least recent object in cache to make room for new object
    private void evict() {
        Iterator<Map.Entry<K, V>> iterator = cacheMap.entrySet().iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}
