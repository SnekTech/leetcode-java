package leetcode.task43;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        String num1 = "2", num2 = "3";
        Solution solution = new Solution();
        String expected = "6";
        String actual = solution.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String num1 = "123", num2 = "456";
        Solution solution = new Solution();
        String expected = "56088";
        String actual = solution.multiply(num1, num2);
        assertEquals(expected, actual);
    }
}
