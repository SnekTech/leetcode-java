package leetcode.task91;

/**
 * @see <a href="https://leetcode-cn.com/problems/decode-ways/">link</a>
 */
public class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        int pre = 1, current = 1;
        for (int i = 1; i < s.length(); i++) {
            int tmp = current;
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    current = pre;
                }
                else {
                    return 0;
                }
            }
            else if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6')) {
                current = current + pre;
            }
            pre = tmp;
        }

        return current;
    }
}
