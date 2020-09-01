package leetcode.task392;

/**
 * @see https://leetcode-cn.com/problems/is-subsequence/
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean result = true;

        int oldIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            int newIndex = t.indexOf(s.charAt(i), oldIndex);

            if (newIndex != -1) {
                oldIndex = newIndex + 1;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
}
