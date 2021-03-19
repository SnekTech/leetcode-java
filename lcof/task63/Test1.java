package lcof.task63;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] prices = new int[] {7,1,5,3,6,4};
        
        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] prices = new int[] {7,6,4,3,1};

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
}
