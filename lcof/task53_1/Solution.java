package lcof.task53_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/">link</a>
 */
class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        int idx = binarySearch(nums, target);
        if (idx != -1) {
            count++;
            for (int i = idx + 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    count++;
                }
                else {
                    break;
                }
            }

            for (int i = idx - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    count++;
                }
                else {
                    break;
                }
            }
        }

        return count;
    }

    int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = nums[mid];
            if (target == midVal) {
                return mid;
            }
            else if (target > midVal) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}