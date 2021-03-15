package lcof.task53_2;

/**
 * @see <a href="https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/">link</a>
 */
class Solution {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[right] - nums[left] != 1 && left == right - 1) {
                return nums[left] + 1;
            }

            int mid = left + (right - left) / 2;
            if (mid - left != nums[mid] - nums[left]) {
                right = mid;
            }
            else if (right - mid != nums[right] - nums[mid]) {
                left = mid;
            }
            else {
                break;
            }
        }

        return nums[0] == 0 ? nums[nums.length - 1] + 1 : 0;
    }
}