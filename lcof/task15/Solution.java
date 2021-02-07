package lcof.task15;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">link</a>
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n &= n - 1;
        }

        return count;
    }
}