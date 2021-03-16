package lcof.task58_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "abcdefg";
        int k = 2;

        Solution solution = new Solution();
        String expected = "cdefgab";
        String actual = solution.reverseLeftWords(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "lrloseumgh";
        int k = 6;

        Solution solution = new Solution();
        String expected = "umghlrlose";
        String actual = solution.reverseLeftWords(s, k);
        assertEquals(expected, actual);
    }
}
