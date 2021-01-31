package leetcode.task90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/subsets-ii/">link</a>
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        backTrack(nums, 0);

        return result;
    }

    private void backTrack(int[] nums, int index) {
        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        int current = nums[index];
        int sameCount = 1;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] == current) {
                sameCount++;
            }
            else {
                break;
            }
        }

        for (int i = 0; i <= sameCount; i++) {
            for (int j = 0; j < i; j++) {
                subset.add(current);
            }
            backTrack(nums, index + sameCount);
            for (int j = 0; j < i; j++) {
                subset.remove(subset.size() - 1);
            }
        }
    }
}
