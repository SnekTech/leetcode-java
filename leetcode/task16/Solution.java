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

                int third = n - 1;
                while (second < third) {
                    int sum = nums[first] + nums[second] + nums[third];

                    if (Math.abs(sum - target) < Math.abs(ans - target)) {
                        ans = sum;
                    }

                    if (sum > target) {
                        third--;
                    }
                    else if (sum < target) {
                        second++;
                    }
                    else {
                        return sum;
                    }
                }
            }
        }

        return ans;
    }
}
