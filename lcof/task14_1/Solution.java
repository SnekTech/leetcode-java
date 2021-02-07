package lcof.task14_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-lcof/">link</a>
 */
class Solution {
    int maxProduct = 1;

    public int cuttingRope(int n) {
        backTrack(n, 1, 0, 0);

        return maxProduct;
    }

    void backTrack(int n, int product, int length, int count) {
        if (length > n) {
            return;
        }

        if (length == n) {
            if (count > 1) {
                maxProduct = Math.max(product, maxProduct);
            }
            return;
        }

        for (int i = 1; i <= n - length; i++) {
            backTrack(n, product * i, length + i, count + 1);
        }
    }
}