package leetcode.task49;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/group-anagrams/">link</a>
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
            int[] counts = new int[26];
            for (var str : strs) {
                Arrays.fill(counts, 0);

                for (int i = 0; i < str.length(); i++) {
                    counts[str.charAt(i) - 'a']++;
                }

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    if (counts[i] != 0) {
                        sb.append((char)('a' + i));
                        sb.append(counts[i]);
                    }
                }
                String key = sb.toString();

                List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        return new ArrayList<>(map.values());
    }
}
