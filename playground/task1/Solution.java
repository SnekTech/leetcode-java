package playground.task1;

/**
 * 一个n+1位的数组，里面数字的范围是1-n，只有一个数字有重复，可能重复多次。找出这个数字
 */
public class Solution {
    public int find(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[nums[i]]);
            }
        }

        return nums[0];
    }

    void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }

        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
