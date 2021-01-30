package leetcode.task80;

/**
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/">link</a>
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;

        int sameCount = 1, duplicateCount = 0, current = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == current) {
                sameCount++;
                if (sameCount > 2) {
                    nums[i] = Integer.MAX_VALUE;
                    duplicateCount++;
                }
            }
            else {
                sameCount = 1;
                current = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < Integer.MAX_VALUE) {
                continue;
            }

            int nextValidIndex = -1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < Integer.MAX_VALUE) {
                    nextValidIndex = j;
                    break;
                }
            }

            if (nextValidIndex != -1) {
                swap(nums, i, nextValidIndex);
            }
            else {
                break;
            }
        }

        return n - duplicateCount;
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
