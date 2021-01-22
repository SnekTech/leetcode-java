package leetcode.task16;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/3sum-closest/">link</a>
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int ans = nums[0] + nums[1] + nums[2];

        int n = nums.length;
        for (int first = 0; first < n; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            for (int second = first + 1; second < n; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                for (int third = second + 1; third < n; third++) {
                    if (third > second + 1 && nums[third] == nums[third - 1]) {
                        continue;
                    }

                    int a = nums[first], b = nums[second], c = nums[third];

                    if (Math.abs(a + b + c - target) < Math.abs(ans - target)) {
                        ans = a + b + c;
                    }
                }
            }
        }

        return ans;
    }
}
