package leetcode.task33;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">link</a>
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int n = nums.length;

        int offset = 0;
        for (int i = 0; i < n; i++) {
            offset++;
            if (i == n - 1 || nums[i] >= nums[i + 1]) {
                break;
            }
        }

        offset %= n;

        if (offset > 0) {
            int[] tmp = Arrays.copyOf(nums, offset);
            System.arraycopy(nums, offset, nums, 0, n - offset);
            System.arraycopy(tmp, 0, nums, n - offset, offset);
        }

        int origin = bSearch(nums, target);

        return origin == -1 ? -1 : (origin + offset) % n;
    }

    private int bSearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int n = nums.length;

        int i = 0, j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        return -1;
    }
}
