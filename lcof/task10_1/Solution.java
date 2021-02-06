package lcof.task10_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/">link</a>
 */
public class Solution {
    public int fib(int n) {
        int[] f = new int[101];

        int result = -1;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                f[i] = 0;
            }
            else if (i == 1) {
                f[1] = 1;
            }
            else {
                f[i] = (f[i - 2] + f[i - 1]) % 1000000007;
            }

            if (i == n) {
                result = f[i];
                break;
            }
        }


        return result;
    }
}