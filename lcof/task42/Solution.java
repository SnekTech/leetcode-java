package lcof.task42;

/**
 * @see <a href="https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/">link</a>
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int prev = 0;
        int current;
        for (var x : nums) {
            current = x;
            if (prev > 0) {
                current += prev;
            }
            max = Math.max(max, current);
            prev = current;
        }

        return max;
    }
}