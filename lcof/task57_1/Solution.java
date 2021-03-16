package lcof.task57_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/">link</a>
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            }
            else if (sum > target) {
                right--;
            }
            else {
                return new int[] {nums[left], nums[right]};
            }
        }

        return null;
    }
}