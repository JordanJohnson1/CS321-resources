public class CacheExperiment {

    private static final int CACHE_SIZE = 4; // max cache size

    /**
     * Add object to cache 
     */
    public static void runCacheExperiment() {
        // create cache with the specified size
        Cache<Integer, TestObject> cache = new Cache<>(CACHE_SIZE);

        // create test objects
        TestObject t1 = new TestObject(1);
        TestObject t2 = new TestObject(2);
        TestObject t3 = new TestObject(3);
        TestObject t4 = new TestObject(4);
        TestObject t5 = new TestObject(5);
        TestObject t6 = new TestObject(6);

        // Simulate adding objects to the cache
       
        cache.add(t1);
        cache.add(t2);
        cache.add(t3);
        cache.add(t4);
        cache.add(t5); // t1 should be evicted
        cache.get(2); // Access t2
        cache.add(t6); // doing this evicts t3
        cache.clear();

    }

    public static void main(String[] args) {
        // Run the cache experiment
        runCacheExperiment();
    }
}
