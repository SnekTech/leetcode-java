package leetcode.task389;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example() {
        String s = "abcd";
        String t = "abcde";

        char expected = 'e';
        char actual = new Solution().findTheDifference(s, t);

        assertEquals(expected, actual);
    }
}
