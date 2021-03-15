package lcof.task56_1;

import java.util.HashSet;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/">link</a>
 */
class Solution {
    public int[] singleNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (var x : nums) {
            if (set.contains(x)) {
                set.remove(x);
            }
            else {
                set.add(x);
            }
        }

        assert set.size() == 2;
        int[] result = new int[2];
        int i = 0;
        for (var x : set) {
            result[i++] = x;
        }

        return result;
    }
}