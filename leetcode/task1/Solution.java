package leetcode.task1;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // num -> index

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int otherNum = target - num;
            if (map.containsKey(otherNum)) {
                int otherIndex = map.get(otherNum);
                if (otherIndex != i) {
                    return new int[] { i, otherIndex };
                }
            }
        }

        throw new IllegalArgumentException("No solution!");
    }
}
