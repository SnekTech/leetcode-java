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

        int offset = 0;
        for (int i = 0; i < n; i++) {
            offset++;
            if (i == n - 1 || nums[i] >= nums[i + 1]) {
                break;
            }
        }

        offset %= n;

        if (offset > 0) {
            int[] tmp = new int[n + offset];
            System.arraycopy(nums, 0, tmp, 0, n);
            System.arraycopy(nums, 0, tmp, n, offset);
            nums = tmp;
        }

        int origin = bSearch(nums, offset, offset + n - 1, target);

        return origin == -1 ? -1 : origin % n;
    }

    private int bSearch(int[] nums, int i, int j, int target) {

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
