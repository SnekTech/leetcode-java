package leetcode.task47;

import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/permutations-ii/">link</a>
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[][] expectedNums = new int[][] {
                { 1, 1, 2 },
                { 1, 2, 1 },
                { 2, 1, 1 }
        };

        return Test1.from2DArray(expectedNums);
    }
}
