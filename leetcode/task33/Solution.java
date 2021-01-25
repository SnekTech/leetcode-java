package leetcode.task33;

/**
 * @see <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">link</a>
 */
public class Solution {
    public int search(int[] nums, int target) {
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

            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    i = mid + 1;
                }
                else {
                    j = mid - 1;
                }
            }
        }

        return -1;
    }
}
