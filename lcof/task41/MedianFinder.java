package lcof.task41;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/">link</a>
 */
class MedianFinder {
    Queue<Integer> A, B;

    /** initialize your data structure here. */
    public MedianFinder() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        }
        else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        assert A.size() > 0;
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }
}