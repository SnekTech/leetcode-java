package lcof.task10_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 2;

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.fib(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 5;

        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.fib(n);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int n = 48;

        Solution solution = new Solution();
        int expected = 807526948;
        int actual = solution.fib(n);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        int n = 81;

        Solution solution = new Solution();
        int expected = 107920472;
        int actual = solution.fib(n);
        assertEquals(expected, actual);
    }
}
