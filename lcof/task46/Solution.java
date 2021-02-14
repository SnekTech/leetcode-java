package lcof.task46;

/**
 * @see <a href="https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/">link</a>
 */
class Solution {
    public int translateNum(int num) {
        var s = num + "";
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n];
        dp[0] = 1;

        char first = s.charAt(0);
        char second = s.charAt(1);
        if (first == '1' || (first == '2' && second <= '5')) {
            dp[1] = 2;
        }
        else {
            dp[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            char current = s.charAt(i);
            char prev = s.charAt(i - 1);

            if (prev == '1' || (prev == '2' && current <= '5')) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            else {
                dp[i] = dp[i - 1];
            }
        }


        return dp[n - 1];
    }
}