package lcof.task64;

/**
 * @see <a href="https://leetcode-cn.com/problems/qiu-12n-lcof/">link</a>
 */
@SuppressWarnings("unused")
class Solution {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}