package lcof.task48;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/">link</a>
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        char[] arr = s.toCharArray();
        int start = 0, end = 0, max = 1;

        for (int i = 1; i < n; i++) {
            char current = arr[i];
            int pos = -1;
            for (int j = start; j <= end; j++) {
                if (current == arr[j]) {
                    pos = j;
                    break;
                }
            }
            end++;

            if (pos != -1) {
                start = pos + 1;
            }
            max = Math.max(max, end - start + 1);
        }

        return max;
    }

    private int find(char[] s, int start, int end) {
        if (!hasDuplicate(s, start, end)) {
            return end - start + 1;
        }
        else {
            return Math.max(find(s, start + 1, end), find(s, start, end - 1));
        }
    }

    private boolean hasDuplicate(char[] s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            set.add(s[i]);
        }

        return set.size() != end - start + 1;
    }
}