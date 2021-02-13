package lcof.task39;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/">link</a>
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        int major = -1;
        int minCount = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1;
        for (var entry : map.entrySet()) {
            if (entry.getValue() >= minCount) {
                major = entry.getKey();
            }
        }

        return major;
    }
}