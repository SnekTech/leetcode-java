package lcof.task42;

/**
 * @see <a href="https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/">link</a>
 */
class Solution {
    int max;

    public int maxSubArray(int[] nums) {
        int sum = 0;
        for (var x : nums) {
            sum += x;
        }

        max = sum;

        int left = 0, right = nums.length - 1;
        find(nums, sum, left, right);

        return max;
    }

    private void find(int[] nums, int sum, int left, int right) {
        if (left > right) {
            return;
        }
        max = Math.max(max, sum);
        find(nums, sum - nums[left], left + 1, right);
        find(nums, sum - nums[right], left, right - 1);
    }
}