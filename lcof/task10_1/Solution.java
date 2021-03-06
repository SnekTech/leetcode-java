package lcof.task10_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/">link</a>
 */
public class Solution {
    public int fib(int n) {
        int a = 0, b = 1, sum;

        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;
    }
}