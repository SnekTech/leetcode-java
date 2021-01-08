package leetcode.task189;

/**
 * @see <a href="https://leetcode-cn.com/problems/rotate-array/">link</a>
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateOnce(nums);
        }
    }

    private void rotateOnce(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return;
        }

        int last = nums[length - 1];
        System.arraycopy(nums, 0, nums, 1, length - 1);

        nums[0] = last;
    }
}
