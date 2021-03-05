package leetcode.task128;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/longest-consecutive-sequence/">link</a>
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int n = nums.length;
        int maxLength = 1, currentLength = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            }
            else if (nums[i + 1] == nums[i] + 1) {
                currentLength++;
            }
            else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}