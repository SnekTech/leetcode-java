package lcof.task17;

/**
 * @see <a href="https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/">link</a>
 */
class Solution {
    public int[] printNumbers(int n) {
        int max = 0, base = 1;
        for (int i = 1; i <= n; i++) {
            max += base * 9;
            base *= 10;
        }

        int[] result = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = i + 1;
        }

        return result;
    }
}