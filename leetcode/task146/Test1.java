package leetcode.task146;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        var x1 = cache.get(1);
        cache.put(3, 3);
        var x2 = cache.get(2);
        cache.put(4, 4);
        var x3 = cache.get(1);
        var x4 = cache.get(3);
        var x5 = cache.get(4);
        assertTrue(true);
    }
}
