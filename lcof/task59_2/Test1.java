package lcof.task59_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        MaxQueue queue = new MaxQueue();
        queue.push_back(1);
        queue.push_back(2);
        var a = queue.max_value();
        assertEquals(a, 2);
        var b = queue.pop_front();
        assertEquals(b, 1);
        var c = queue.max_value();
        assertEquals(c, 2);
    }

    @Test
    public void example2() {
        MaxQueue queue = new MaxQueue();
        var a = queue.pop_front();
        assertEquals(a, -1);
        var b = queue.max_value();
        assertEquals(b, -1);
    }
}
