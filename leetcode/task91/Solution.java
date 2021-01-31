package leetcode.task91;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode-cn.com/problems/decode-ways/">link</a>
 */
public class Solution {
    Map<String, String> table = new HashMap<>();
    Set<String> result = new HashSet<>();
    StringBuilder decoded = new StringBuilder();

    public int numDecodings(String s) {
        for (int i = 0; i < 26; i++) {
            table.put(String.valueOf(i + 1), Character.toString('A' + (char)i));
        }

        backTrack(s, 0);

        return result.size();
    }

    void backTrack(String s, int index) {
        if (index == s.length()) {
            result.add(decoded.toString());
            return;
        }

        String key = s.substring(index, index + 1);
        if (table.containsKey(key)) {
            decoded.append(table.get(key));
            backTrack(s, index + 1);
            decoded.deleteCharAt(decoded.length() - 1);
        }

        if (index < s.length() - 1) {
            key = s.substring(index, index + 2);
            if (table.containsKey(key)) {
                decoded.append(table.get(key));
                backTrack(s, index + 2);
                decoded.deleteCharAt(decoded.length() - 1);
            }
        }
    }
}
