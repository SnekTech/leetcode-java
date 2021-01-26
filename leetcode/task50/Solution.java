package leetcode.task50;

/**
 * @see <a href="https://leetcode-cn.com/problems/powx-n/">link</a>
 */
public class Solution {
    public double myPow(double x, int n) {
        double result = quickPow(x, n);

        return n >= 0 ? result : 1.0 / result;
    }

    private double quickPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double y = quickPow(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}
