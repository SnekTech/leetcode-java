package lcof.task17;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 1;

        Solution solution = new Solution();
        int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
        int[] actual = solution.printNumbers(n);
        assertArrayEquals(expected, actual);
    }
}
