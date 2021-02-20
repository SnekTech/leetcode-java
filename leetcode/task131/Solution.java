package leetcode.task131;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/palindrome-partitioning/">link</a>
 */
class Solution {
    List<List<String>> result = new ArrayList<>();
    List<String> current = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(s, 0);

        return result;
    }

    void dfs(String s, int index) {
        int n = s.length();
        if (index == n) {
            result.add(new ArrayList<>(current));
        }

        for (int i = index; i < n; i++) {
            if (isPalindrome(s, index, i)) {
                current.add(s.substring(index, i + 1));
                dfs(s, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

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