package leetcode.task139;

import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/word-break/">link</a>
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length];

        for (int i = 0; i < length; i++) {
            boolean isBreakable = false;
            for (var word : wordDict) {
                if (i - word.length() >= 0) {
                    isBreakable = dp[i - word.length()] && s.substring(i - word.length() + 1, i + 1).equals(word);
                    if (isBreakable) {
                        break;
                    }
                }
                else if (i - word.length() == -1) {
                    isBreakable = s.substring(0, i + 1).equals(word);
                    if (isBreakable) {
                        break;
                    }
                }
            }
            dp[i] = isBreakable;
        }

        return dp[length - 1];
    }
}