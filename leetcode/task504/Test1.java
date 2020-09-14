package leetcode.task504;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int num = 100;

        String expected = "202";
        String actual = new Solution().convertToBase7(num);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int num = -7;

        String expected = "-10";
        String actual = new Solution().convertToBase7(num);

        assertEquals(expected, actual);
    }
}
