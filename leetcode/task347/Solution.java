package leetcode.task347;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/top-k-frequent-elements/">link</a>
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (var num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        //noinspection ComparatorCombinators
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );
        int[] result = new int[k];

        for (var key : map.keySet()) {
            if (queue.size() < k) {
                queue.add(key);
            }
            else if (map.get(key) > map.get(queue.peek())) {
                queue.poll();
                queue.add(key);
            }
        }

        for (int i = 0; !queue.isEmpty(); i++) {
            result[i] = queue.poll();
        }

        return result;
    }
}