package leetcode.task39;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/combination-sum/">link</a>
 */
public class Solution {

    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            combination.add(candidates[i]);
            dfs(i, sum + candidates[i]);
            combination.remove(combination.size() - 1);
        }
    }
}
