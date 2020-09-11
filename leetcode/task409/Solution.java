package leetcode.task409;

import java.util.ArrayList;

/**
 * @see https://leetcode-cn.com/problems/longest-palindrome/
 */
public class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (list.indexOf(current) != -1) {
                list.remove(list.indexOf(current));
                result++;
            } else {
                list.add(current);
            }
        }

        result*=2;
        if (list.size() != 0) {
            result++;
        }

        return result;
    }
}
