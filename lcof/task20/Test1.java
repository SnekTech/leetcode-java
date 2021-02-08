package lcof.task20;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "+100";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        String s = "5e2";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertTrue(actual);
    }

    @Test
    public void example3() {
        String s = "-123";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertTrue(actual);
    }

    @Test
    public void example4() {
        String s = "3.1416";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertTrue(actual);
    }

    @Test
    public void example5() {
        String s = "-1E-16";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertTrue(actual);
    }

    @Test
    public void example6() {
        String s = "0123";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertTrue(actual);
    }

    @Test
    public void example7() {
        String s = "12e";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertFalse(actual);
    }

    @Test
    public void example8() {
        String s = "1a3.14";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertFalse(actual);
    }

    @Test
    public void example9() {
        String s = "1.2.3";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertFalse(actual);
    }

    @Test
    public void example10() {
        String s = "+-5";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertFalse(actual);
    }

    @Test
    public void example11() {
        String s = "12e+5.4";

        Solution solution = new Solution();
        boolean actual = solution.isNumber(s);
        assertFalse(actual);
    }
}
