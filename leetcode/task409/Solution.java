package leetcode.task409;

/**
 * @see https://leetcode-cn.com/problems/longest-palindrome/
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int result = 0;
        for (int n : count) {
            result += n / 2 * 2;

            if (n % 2 == 1 && result % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}
