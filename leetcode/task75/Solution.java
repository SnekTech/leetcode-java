package leetcode.task75;

/**
 * @see <a href="https://leetcode-cn.com/problems/sort-colors/">link</a>
 */
public class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int border = 0;

        for (int i = border; i < n; i++) {
            if (nums[i] == 0) {
                swap(nums, i, border++);
            }
        }

        for (int i = border; i < n; i++) {
            if (nums[i] == 1) {
                swap(nums, i, border++);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }

        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
