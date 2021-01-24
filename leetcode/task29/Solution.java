package leetcode.task29;

/**
 * @see <a href="https://leetcode-cn.com/problems/divide-two-integers/">link</a>
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            return dividend > Integer.MIN_VALUE ? -dividend : Integer.MAX_VALUE;
        }

        boolean isPositive = true;

        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            isPositive = false;
        }
        dividend = dividend < 0 ? dividend : -dividend;
        divisor = divisor < 0 ? divisor : -divisor;

        int result = div(dividend, divisor);

        return isPositive ? result : -result;
    }

    private int div(int dividend, int divisor) {
        if (dividend > divisor) {
            return 0;
        }

        int result = 1;
        int accumulate = divisor;
        while (accumulate + accumulate < 0 && dividend < 2 * accumulate) {
            result += result;
            accumulate += accumulate;
        }

        return result + div(dividend - accumulate, divisor);
    }
}
