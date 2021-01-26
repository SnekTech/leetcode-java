package leetcode.task47;


import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/permutations-ii/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    int n;
    int[] nums;
    boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }

        n = nums.length;
        this.nums = nums;
        visited = new boolean[n];
        Arrays.fill(visited, false);
        Arrays.sort(nums);

        backTrack(0);

        return result;
    }

    private void backTrack(int pos) {
        if (pos == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }

            if (!visited[i]) {
                current.add(nums[i]);
                visited[i] = true;
                backTrack(pos + 1);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }
}
