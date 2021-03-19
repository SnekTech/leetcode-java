package lcof.task61;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/">link</a>
 */
class Solution {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int kings = 0;
        int min = Integer.MAX_VALUE;
        for (var num : nums) {
            if (num == 0) {
                kings++;
            }
            else {
                min = Math.min(min, num);
                if (!set.contains(num)) {
                    set.add(num);
                }
                else {
                    return false;
                }
            }
        }

        for (int i = 1; i < 5; i++) {
            if (!set.contains(min + i)) {
                if (kings > 0) {
                    kings--;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}