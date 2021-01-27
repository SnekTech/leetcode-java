package leetcode.task55;

/**
 * @see <a href="https://leetcode-cn.com/problems/jump-game/">link</a>
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
                if (max >= nums.length - 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
