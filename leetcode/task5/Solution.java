package leetcode.task5;

/**
 * @see <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">link</a>
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int armLength = expandAroundCenter(s, i);
            if (armLength * 2 - 1 > answer.length()) {
                answer = s.substring(i - armLength + 1, i + armLength);
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int armLength = expandAroundCenter(s, i, i + 1);
            if (armLength * 2 > answer.length()) {
                answer = s.substring(i - armLength + 1, i + armLength + 1);
            }
        }

        return answer;


    }

    /**
     * expand around a center position in a string to find the longest palindrome
     * @param s the string
     * @param i start index, inclusive
     * @param j end index, inclusive
     * @return the 'arm length' of the longest palindrome --- from palindrome start(inclusive) to i(inclusive)
     */
    private int expandAroundCenter(String s, int i, int j) {
        if (i < 0 || j >= s.length() || i > j) {
            throw new IllegalArgumentException();
        }

        int length = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            length++;
            i--;
            j++;
        }

        return length;
    }

    /**
     * expand around a center position in a string to find the longest palindrome
     * @param s the string
     * @param i center index
     * @return the 'arm length' of the longest palindrome --- from palindrome start(inclusive) to i(inclusive)
     */
    private int expandAroundCenter(String s, int i) {
        return expandAroundCenter(s, i, i);
    }
}
