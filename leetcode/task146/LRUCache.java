package leetcode.task146;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @see <a href="https://leetcode-cn.com/problems/lru-cache/">link</a>
 */
class LRUCache {
    int k;
    HashMap<Integer, Integer> dataMap;
    LinkedList<Integer> list = new LinkedList<>();

    public LRUCache(int capacity) {
        k = capacity;
        dataMap = new HashMap<>(k);
    }

    public int get(int key) {
        if (dataMap.containsKey(key)) {
            var value = dataMap.get(key);
            list.removeFirstOccurrence(key);
            list.addLast(key);
            return value;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (dataMap.containsKey(key)) {
            dataMap.put(key, value);
            list.remove(Integer.valueOf(key));
            list.addLast(key);
            return;
        }

        if (dataMap.size() >= k) {
            var minKey = list.pollFirst();

            dataMap.remove(minKey);

        }
        dataMap.put(key, value);
        list.addLast(key);
    }
}