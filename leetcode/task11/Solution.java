package leetcode.task11;

/**
 * @see <a href="https://leetcode-cn.com/problems/container-with-most-water/">link</a>
 */
public class Solution {
    public int maxArea(int[] height) {
        return maxSubArea(height, height.length - 1);
    }

    /**
     * find max from sub area [0 ... end]
     * @param height original height data
     * @param end end index (inclusive)
     * @return max from sub area
     */
    private int maxSubArea(int[] height, int end) {
        if (end <= 0) return 0;

        if (end == 1) {
            return Math.min(height[0], height[1]);
        }

        int max = maxSubArea(height, end - 1);
        for (int i = 0; i < end; i++) {
            int w = end - i;
            int h = Math.min(height[i], height[end]);
            max = Math.max(max, w * h);
        }

        return max;
    }
}
