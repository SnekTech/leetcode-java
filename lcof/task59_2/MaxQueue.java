package lcof.task59_2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @see <a href="https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/">link</a>
 */
class MaxQueue {
    Deque<Integer> dequeA = new LinkedList<>();
    Deque<Integer> dequeB = new LinkedList<>();

    public MaxQueue() {

    }

    public int max_value() {
        return dequeB.isEmpty() ? -1 : dequeB.peekFirst();
    }

    public void push_back(int value) {
        dequeA.addLast(value);
        while (!dequeB.isEmpty() && dequeB.peekLast() < value) {
            dequeB.removeLast();
        }
        dequeB.addLast(value);
    }

    public int pop_front() {
        if (dequeA.isEmpty() || dequeB.isEmpty()) {
            return -1;
        }

        int v = dequeA.removeFirst();
        assert !dequeB.isEmpty();
        if (v == dequeB.peekFirst()) {
            dequeB.removeFirst();
        }
        return v;
    }
}
