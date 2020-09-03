package leetcode.task1394;

import java.util.TreeMap;

/**
 * @see https://leetcode-cn.com/problems/find-lucky-integer-in-an-array/
 */
public class Solution {
    public int findLucky(int[] arr) {
        int[] result = { -1 };

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], 1, Integer::sum);
        }
        map.forEach((num, count) -> {
            if (num == count) {
                result[0] = num; // TreeMap iteration default as low -> ... -> high
            }
        });

        return result[0];
    }
}
