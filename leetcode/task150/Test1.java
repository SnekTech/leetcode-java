package leetcode.task150;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String[] tokens = new String[] {"2", "1", "+", "3", "*"};

        Solution solution = new Solution();
        int expected = 9;
        int actual = solution.evalRPN(tokens);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String[] tokens = new String[] {"4", "13", "5", "/", "+"};

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.evalRPN(tokens);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String[] tokens = new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        Solution solution = new Solution();
        int expected = 22;
        int actual = solution.evalRPN(tokens);
        assertEquals(expected, actual);
    }
}
