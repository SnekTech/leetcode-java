package leetcode.task11;

/**
 * @see <a href="https://leetcode-cn.com/problems/container-with-most-water/">link</a>
 */
public class Solution {
    public int maxArea(int[] height) {
        if (height.length <= 1) return 0;

        int left = 0, right = height.length - 1;

        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int width = right - left;
            if (leftHeight < rightHeight) {
                max = Math.max(max, width * leftHeight);
                left++;
            }
            else {
                max = Math.max(max, width * rightHeight);
                right--;
            }
        }

        return max;
    }
}
