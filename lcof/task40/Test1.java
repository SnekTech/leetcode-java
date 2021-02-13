package lcof.task40;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] arr = new int[] {3, 2, 1};
        int k = 2;

        Solution solution = new Solution();
        var actual = solution.getLeastNumbers(arr, k);
        assertTrue(true);
    }
}
