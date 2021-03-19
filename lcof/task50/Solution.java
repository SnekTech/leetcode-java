package lcof.task50;

import java.util.HashMap;

/**
 * @see <a href="https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/">link</a>
 */
class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.get(c) == 1) {
                return c;
            }
        }

        return ' ';
    }
}