package lcof.task16;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Solution {
    @SuppressWarnings("UnnecessaryLocalVariable")
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickPow(x, N) : 1.0 / quickPow(x, -N);
    }

    private double quickPow(double x, long N) {
        double ans = 1.0;
        double x_contribute = x;

        while (N > 0) {
            if ((N & 1) == 1) {
                ans *= x_contribute;
            }

            x_contribute *= x_contribute;
            N >>= 1;
        }

        return ans;
    }
}