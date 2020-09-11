package leetcode.task409;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example() {
        String s = "abccccdd";
        int expected = 7;
        
        int actual = new Solution().longestPalindrome(s);
        assertEquals(expected, actual);
    }
}
