package leetcode.task12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        int num = 3;
        Solution solution = new Solution();
        String expected = "III";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int num = 4;
        Solution solution = new Solution();
        String expected = "IV";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int num = 9;
        Solution solution = new Solution();
        String expected = "IX";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int num = 58;
        Solution solution = new Solution();
        String expected = "LVIII";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        int num = 1994;
        Solution solution = new Solution();
        String expected = "MCMXCIV";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual);
    }
}
