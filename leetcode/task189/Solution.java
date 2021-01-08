package leetcode.task189;

/**
 * @see <a href="https://leetcode-cn.com/problems/rotate-array/">link</a>
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }

        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    /**
     * Reverse nums[i...j]
     * @param nums integer array
     * @param i start index - inclusive
     * @param j end index - inclusive
     */
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}
