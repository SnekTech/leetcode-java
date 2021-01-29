package leetcode.task75;

/**
 * @see <a href="https://leetcode-cn.com/problems/sort-colors/">link</a>
 */
public class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if (num != 0) {
                int nextZeroIndex = -1;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] == 0) {
                        nextZeroIndex = j;
                        break;
                    }
                }

                if (nextZeroIndex != -1) {
                    swap(nums, i, nextZeroIndex);
                }
                else {
                    if (num != 1) {
                        int nextOneIndex = -1;
                        for (int j = i + 1; j < n; j++) {
                            if (nums[j] == 1) {
                                nextOneIndex = j;
                                break;
                            }
                        }

                        if (nextOneIndex != -1) {
                            swap(nums, i, nextOneIndex);
                        }
                    }
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
