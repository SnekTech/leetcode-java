package leetcode.task18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/4sum/">link</a>
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
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

                    int forth = n - 1;
                    while (third < forth) {
                        int sum = nums[first] + nums[second] + nums[third] + nums[forth];
                        if (sum < target) {
                            third++;
                        }
                        else if (sum > target) {
                            forth--;
                        }
                        else {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[first]);
                            list.add(nums[second]);
                            list.add(nums[third]);
                            list.add(nums[forth]);
                            result.add(list);
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }
}
