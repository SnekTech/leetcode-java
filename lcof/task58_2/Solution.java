package lcof.task58_2;

/**
 * @see <a href="https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/">link</a>
 */
class Solution {
    public String reverseLeftWords(String s, int k) {
        StringBuilder builder = new StringBuilder(s);
        builder.append(s);

        return builder.substring(k, k + s.length());
    }
}