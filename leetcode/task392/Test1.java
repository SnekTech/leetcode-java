package leetcode.task392;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        String s = "abc";
        String t = "ahbgdc";
        boolean expected = true;

        boolean actual = new Solution().isSubSequence(s, t);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean expected = false;

        boolean actual = new Solution().isSubSequence(s, t);

        assertEquals(expected, actual);
    }
}
