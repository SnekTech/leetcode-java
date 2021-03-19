package lcof.task65;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int a = 1, b = 1;

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.add(a, b);
        assertEquals(expected, actual);
    }
}
