package leetcode.task42;

/**
 * @see <a href="https://leetcode-cn.com/problems/trapping-rain-water/">link</a>
 */
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;

        for (int i = 1; i < n - 1; i++) {
            int maxLeft = 0, maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < n; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }

            sum += Math.min(maxLeft, maxRight) - height[i];
        }

        return sum;
    }
}