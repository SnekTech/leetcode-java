package lcof.task15;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">link</a>
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }

        return count;
    }
}