package leetcode.task32;

/**
 * @see <a href="https://leetcode-cn.com/problems/longest-valid-parentheses/">link</a>
 */
class Solution {
    public int longestValidParentheses(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n];
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                }
                else {
                    if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0) + dp[i - 1] + 2;
                    }
                }
                max = Math.max(max, dp[i]);
            }
        }

        return max;
    }
}