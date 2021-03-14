package leetcode.task84;

/**
 * @see <a href="https://leetcode-cn.com/problems/largest-rectangle-in-histogram/">link</a>
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int n = heights.length;

        for (int mid = 0; mid < n; mid++) {
            int height = heights[mid];
            int left = mid, right = mid;

            while (left >= 0 && heights[left] >= height) {
                left--;
            }
            left++;
            while (right < n && heights[right] >= height) {
                right++;
            }
            right--;

            ans = Math.max(ans, height * (right - left + 1));
        }

        return ans;
    }
}