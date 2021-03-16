package lcof.task58_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/">link</a>
 */
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int left = s.length() - 1, right = left;
        StringBuilder builder = new StringBuilder();

        while (left >= 0) {
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            builder.append(s, left + 1, right + 1).append(' ');
            while (left >= 0 && s.charAt(left) == ' ') {
                left--;
            }
            right = left;
        }
        return builder.toString().trim();
    }
}