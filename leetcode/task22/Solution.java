package leetcode.task22;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/generate-parentheses/">link</a>
 */
public class Solution {
    Set<String> result = new HashSet<>();
    StringBuilder seq = new StringBuilder();
    int length;
    public List<String> generateParenthesis(int n) {
        length = 2 * n;
        backTrack(0);
        return new ArrayList<>(result);
    }

    private void backTrack(int i) {
        if (i == length) {
            if (parenthesisMatches(seq.toString())) {
                result.add(seq.toString());
            }
            return;
        }

        seq.append('(');
        backTrack(i + 1);
        seq.setCharAt(seq.length() - 1, ')');
        backTrack(i + 1);
        seq.deleteCharAt(seq.length() - 1);
    }

    private static boolean parenthesisMatches(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var s = new Solution();
        s.generateParenthesis(3);
    }
}
