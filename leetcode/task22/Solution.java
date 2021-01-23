package leetcode.task22;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/generate-parentheses/">link</a>
 */
public class Solution {
    Set<String> result = new HashSet<>();
    StringBuilder seq = new StringBuilder();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        backTrack(0, 0);
        return new ArrayList<>(result);
    }

    private void backTrack(int open, int close) {
        if (seq.length() == n * 2) {
            result.add(seq.toString());
            return;
        }

        if (open < n) {
            seq.append('(');
            backTrack(open + 1, close);
            seq.deleteCharAt(seq.length() - 1);
        }

        if (close < open) {
            seq.append(')');
            backTrack(open, close + 1);
            seq.deleteCharAt(seq.length() - 1);
        }
    }
}
