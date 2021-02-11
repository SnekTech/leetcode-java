package lcof.task31;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] pushed = new int[] {1,2,3,4,5};
        int[] popped = new int[] {4,5,3,2,1};

        Solution solution = new Solution();
        boolean actual = solution.validateStackSequences(pushed, popped);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        int[] pushed = new int[] {1,2,3,4,5};
        int[] popped = new int[] {4,3,5,1,2};

        Solution solution = new Solution();
        boolean actual = solution.validateStackSequences(pushed, popped);
        assertFalse(actual);
    }
}
