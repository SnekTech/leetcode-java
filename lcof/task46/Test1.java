package lcof.task46;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int num = 12258;

        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.translateNum(num);
        assertEquals(expected, actual);
    }
}
