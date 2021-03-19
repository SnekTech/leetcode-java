package lcof.task50;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "abaccdeff";

        Solution solution = new Solution();
        char expected = 'b';
        char actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "";

        Solution solution = new Solution();
        char expected = ' ';
        char actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "cc";

        Solution solution = new Solution();
        char expected = ' ';
        char actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }
}
