package lcof.task30;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/">link</a>
 */
class MinStack {
    Stack<Integer> a, b;

    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.add(x);
        if (b.empty() || b.peek() >= x) {
            b.add(x);
        }
    }

    public void pop() {
        if (a.pop().equals(b.peek())) {
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}