package lcof.task14_2;

/**
 * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/">link</a>
 */
class Solution {
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int THRESHOLD = 1000000007;
        long product = 1;
        while (n > 4) {
            product *= 3;
            product %= THRESHOLD;
            n -= 3;
        }

        return (int)(product * n % THRESHOLD);
    }
}