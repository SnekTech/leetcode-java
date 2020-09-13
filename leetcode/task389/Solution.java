package leetcode.task389;

/**
 * @see https://leetcode-cn.com/problems/find-the-difference/
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        int[] count = new int[26];
        for (char c : t.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) result = (char)(Character.valueOf('a') + i);
        }

        return result;
    }
}
