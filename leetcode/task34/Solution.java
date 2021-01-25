package leetcode.task34;

/**
 * @see <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">link</a>
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] { -1, -1 };

        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;

        int i = 0, j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                int left = mid, right = mid;
                while (left >= 0 && nums[left] == target) {
                    left--;
                }
                left++;

                while (right < n && nums[right] == target) {
                    right++;
                }
                right--;

                result[0] = left;
                result[1] = right;
                break;
            }
            else if (nums[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }

        return result;
    }
}
