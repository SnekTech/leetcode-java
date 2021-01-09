package leetcode.task40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/combination-sum-ii/">link</a>
 */
public class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    private void dfs(int start, int sum) {
        if (sum >= target) {
            if (sum == target) {
                List<Integer> validCombination = new ArrayList<>(combination);
                answer.add(validCombination);
            }

            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i != start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            combination.add(candidates[i]);
            dfs(i + 1, sum + candidates[i]);
            combination.remove(combination.size() - 1);
        }

    }
}
