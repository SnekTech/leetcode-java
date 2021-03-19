package lcof.task66;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] a = new int[] {1,2,3,4,5};

        Solution solution = new Solution();
        int[] expected = new int[] {120,60,40,30,24};
        int[] actual = solution.constructArr(a);
        assertEquals(expected, actual);
    }
}
