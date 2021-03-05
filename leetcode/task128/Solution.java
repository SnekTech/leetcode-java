package leetcode.task128;

import java.util.HashSet;

/**
 * @see <a href="https://leetcode-cn.com/problems/longest-consecutive-sequence/">link</a>
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (var num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        for (var num : nums) {
            if (!set.contains(num - 1)) {
                int length = 1;
                int x = num;
                while (set.contains(x + 1)) {
                    length++;
                    x++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}