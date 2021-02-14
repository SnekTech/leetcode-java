package lcof.task44;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/">link</a>
 */
class Solution {
    public int findNthDigit(int n) {
        // 抄的
        int digit = 1;
        long start = 1;
        long count = 9;

        while (n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;

        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}