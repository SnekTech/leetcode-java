package lcof.task38;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/">link</a>
 */
class Solution {
    List<String> result = new ArrayList<>();
    StringBuilder current = new StringBuilder();

    public String[] permutation(String s) {
        boolean[] visited = new boolean[s.length()];
        var charArray = s.toCharArray();
        Arrays.sort(charArray);

        backTrack(charArray, visited);
        return result.toArray(new String[0]);
    }

    private void backTrack(char[] str, boolean[] visited) {
        int n = str.length;
        if (current.length() == n) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i > 0 && str[i] == str[i - 1] && !visited[i - 1]) {
                continue;
            }

            var ch = str[i];
            if (!visited[i]) {
                current.append(ch);
                visited[i] = true;
                backTrack(str, visited);
                current.deleteCharAt(current.length() - 1);
                visited[i] = false;
            }
        }
    }
}