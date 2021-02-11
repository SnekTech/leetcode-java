package lcof.task33;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] postorder = new int[] {1,6,3,2,5};

        Solution solution = new Solution();
        boolean actual = solution.verifyPostorder(postorder);
        assertFalse(actual);
    }

    @Test
    public void example2() {
        int[] postorder = new int[] {1,3,2,6,5};

        Solution solution = new Solution();
        boolean actual = solution.verifyPostorder(postorder);
        assertTrue(actual);
    }
}
