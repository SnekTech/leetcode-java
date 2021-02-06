package lcof.task9;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/">link</a>
 */
public class CQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }
        if (stack1.size() == 1) {
            return stack1.pop();
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int headValue = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return headValue;
    }
}
