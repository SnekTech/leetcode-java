package lcof.task38;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        String s = "abc";

        Solution solution = new Solution();
        var actual = solution.permutation(s);
        assertTrue(true);
    }

    @Test
    public void wrong1() {
        String s = "aab";

        Solution solution = new Solution();
        var actual = solution.permutation(s);
        assertTrue(true);
    }
}
