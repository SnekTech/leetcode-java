package lcof.task66;

/**
 * @see <a href="https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/">link</a>
 */
class Solution {
    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }

        int[] b = new int[a.length];
        b[0] = 1;

        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }

        int tmp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }

        return b;
    }
}