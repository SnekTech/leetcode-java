package leetcode.task3;

/**
 * @see <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">link</a>
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int max = 1;
        char[] seq = s.toCharArray();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = seq[i];
            int pos = -1;
            for (int j = start; j < end; j++) {
                if (seq[j] == current) {
                    pos = j;
                    break;
                }
            }
            end++;

            if (pos != -1) {
                start = pos + 1;
            }

            max = Math.max(max, end - start);
        }


        return max;
    }
}
