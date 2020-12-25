package leetcode.task47;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/permutations-ii/">link</a>
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        var list = fromIntArray(nums);
        return permute(list);
    }

    private static List<Integer> fromIntArray(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int n : nums)
            list.add(n);

        return list;
    }

    List<List<Integer>> permute(List<Integer> nums) {
        assert nums.size() >= 1;
        List<List<Integer>> permutes = new LinkedList<>();
        if (nums.size() == 1) {
            permutes.add(nums);
            return permutes;
        }

        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            var sub = new LinkedList<>(nums.subList(0, i));
            sub.addAll(nums.subList(i + 1, nums.size()));
            var localPermutes = permute(sub);
            for (var permute : localPermutes) {
                List<Integer> t;
                for (int j = 0; j < permute.size(); j++) {
                    t = new LinkedList<>(permute);
                    t.add(j, current);
                    set.add(t);
                }
                t = new LinkedList<>(permute);
                t.add(current);
                set.add(t);
            }
        }

        permutes.addAll(set);
        return permutes;
    }
}
