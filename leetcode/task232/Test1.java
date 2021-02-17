package leetcode.task232;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        var x1 = myQueue.peek();
        var x2 = myQueue.pop();
        var x3 = myQueue.empty();
        assertTrue(true);
    }
}
