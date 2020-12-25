package leetcode.task47;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Test1 {
    public static List<List<Integer>> from2DArray(int[][] nums) {
        assert nums.length >= 1;
        List<List<Integer>> ret = new ArrayList<>();
        for (int[] num : nums) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums[0].length; j++) {
                list.add(num[j]);
            }
            ret.add(list);
        }

        return ret;
    }

    private static boolean test2DList(List<List<Integer>> actual, List<List<Integer>> expected) {
        if (actual.size() != expected.size())
            return false;

        for (List<Integer> line : actual) {
            var i = expected.indexOf(line);
            if (i == -1) {
                return false;
            } else {
                expected.remove(i);
            }
        }

        return expected.size() == 0;
    }

    @Test
    public void example() {
        int[] nums = new int[] { 1, 1, 2 };
        
        Solution solution = new Solution();
        int[][] expectedNums = new int[][] {
                { 1, 1, 2 },
                { 1, 2, 1 },
                { 2, 1, 1 }
        };
        List<List<Integer>> expected = from2DArray(expectedNums);
        List<List<Integer>> actual = solution.permuteUnique(nums);
        assertTrue(test2DList(actual, expected));
    }
}
