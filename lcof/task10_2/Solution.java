package lcof.task10_2;

/**
 * @see <a href="https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/">link</a>
 */
public class Solution {
    public int numWays(int n) {
        int MAX = 1000000007;
        int a = 1, b = 1, sum;

        for (int i = 0; i < n; i++) {
            sum = (a + b) % MAX;
            a = b;
            b = sum;
        }

        return a;
    }
}