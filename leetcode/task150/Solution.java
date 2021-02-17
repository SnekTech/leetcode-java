package leetcode.task150;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/">link</a>
 */
class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                var b = stack.pop();
                var a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        assert stack.size() == 1;

        return stack.peek();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}