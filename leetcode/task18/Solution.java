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

        if (nums == null || nums.length < 4) {
            return result;
        }

        int n = nums.length;

        Arrays.sort(nums);
        for (int first = 0; first < n - 3; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            if (nums[first] + nums[first + 1] + nums[first + 2] + nums[first + 3] > target) {
                break;
            }

            if (nums[first] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue;
            }

            for (int second = first + 1; second < n - 2; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                if (nums[first] + nums[second] + nums[second + 1] + nums[second + 2] > target) {
                    break;
                }

                if (nums[first] + nums[second] + nums[n - 2] + nums[n - 1] < target) {
                    continue;
                }

                int left = second + 1, right = n - 1;
                while (left < right) {
                    int a = nums[first], b = nums[second], c = nums[left], d = nums[right];
                    int sum = a + b + c + d;
                    if (sum == target) {
                        result.add(Arrays.asList(a, b, c, d));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
