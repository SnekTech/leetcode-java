package lcof.task31;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/">link</a>
 */
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }

        return stack.isEmpty();
    }
}