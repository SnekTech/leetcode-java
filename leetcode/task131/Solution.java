package leetcode.task131;

import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/palindrome-partitioning/">link</a>
 */
class Solution {
    public List<List<String>> partition(String s) {
        return null;
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        int n = s.length();
        if (n <= 1) {
            return true;
        }

        int left = 0, right = n - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}