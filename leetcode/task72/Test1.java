package leetcode.task72;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String word1 = "horse";
        String word2 = "ros";

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.minDistance(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String word1 = "intention";
        String word2 = "execution";

        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.minDistance(word1, word2);
        assertEquals(expected, actual);
    }
}
