package lcof.task31;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/">link</a>
 */
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        if (n == 0) {
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(pushed[i], i);
        }

        Stack<Integer> stack = new Stack<>();
        int prevIndex = -1;
        for (int i = 0; i < n; i++) {
            int index = map.get(popped[i]);
            if (index > prevIndex) {
                for (int j = prevIndex + 1; j < index; j++) {
                    stack.push(pushed[j]);
                }
                prevIndex = index;
            }
            else {
                if (stack.peek() == popped[i]) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }

        }

        return true;
    }
}