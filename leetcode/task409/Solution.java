package leetcode.task409;

import java.util.HashMap;

/**
 * @see https://leetcode-cn.com/problems/longest-palindrome/
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] result = new int[] {0};
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }

        map.forEach((k, v) -> {
            if (v >= 2) {
                result[0] += v / 2;
                map.put(k, v % 2);
            }
        });

        result[0] *= 2;

        if (map.containsValue(1)) {
            result[0]++;
        }

        return result[0];
    }
}
