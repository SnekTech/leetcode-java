package lcof.task30;

import java.util.TreeMap;

/**
 * @see <a href="https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/">link</a>
 */
class MinStack {
    public static final int CAPACITY = 20000;
    private int[] data;
    int nextPos = 0;

    private TreeMap<Integer, Integer> mins;

    /** initialize your data structure here. */
    public MinStack() {
        data = new int[CAPACITY];
        mins = new TreeMap<>();
    }

    public void push(int x) {
        if (nextPos >= CAPACITY) {
            throw new IllegalArgumentException("Can't push to a full stack.");
        }
        data[nextPos++] = x;
        if (mins.containsKey(x)) {
            mins.put(x, mins.get(x) + 1);
        }
        else {
            mins.put(x, 1);
        }
    }

    public void pop() {
        if (nextPos <= 0) {
            throw new IllegalArgumentException("Can't pop from an empty stack.");
        }

        int topVal = top();

        if (mins.containsKey(topVal)) {
            if (mins.get(topVal) > 1) {
                mins.put(topVal, mins.get(topVal) - 1);
            }
            else {
                mins.remove(topVal);
            }
        }
        nextPos--;
    }

    public int top() {
        if (nextPos <= 0) {
            throw new IllegalArgumentException("Empty stack has no top.");
        }
        return data[nextPos - 1];
    }

    public int min() {
        if (mins.isEmpty()) {
            throw new IllegalArgumentException("Empty stack has no minimum.");
        }

        return mins.firstKey();
    }
}