package leetcode.task46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/permutations/">link</a>
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    int n;
    boolean[] visited;

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }

        n = nums.length;
        visited = new boolean[n];
        Arrays.fill(visited, false);

        backTrack(nums, 0);

        return result;
    }

    private void backTrack(int[] nums, int pos) {
        if (pos == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                current.add(nums[i]);
                visited[i] = true;
                backTrack(nums, pos + 1);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }
}
