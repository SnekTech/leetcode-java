package leetcode.task78;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/subsets/">link</a>
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return result;
    }

    void dfs(int[] nums, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        dfs(nums, i + 1);
        current.add(nums[i]);
        dfs(nums, i + 1);
        current.remove(current.size() - 1);
    }
}
