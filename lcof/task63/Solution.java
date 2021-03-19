package lcof.task63;

/**
 * @see <a href="https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/">link</a>
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int n = prices.length;
        int[] minHeight = new int[n];
        minHeight[0] = prices[0];

        for (int i = 1; i < n; i++) {
            minHeight[i] = Math.min(prices[i], minHeight[i - 1]);
        }
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minHeight[i - 1]);
        }

        return maxProfit;
    }
}