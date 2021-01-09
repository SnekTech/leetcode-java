package leetcode.task39;

import org.junit.Test;

import java.util.List;

public class Test1 {
    @Test
    public void example() {
        int[] candidates = new int[] { 2, 3, 6, 7 };
        int target = 7;

        Solution solution = new Solution();
//        List<List<Integer>> expected = solution.combinationSum(candidates, target);
        List<List<Integer>> actual = solution.combinationSum(candidates, target);

    }
}
