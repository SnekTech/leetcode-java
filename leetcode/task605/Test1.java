package leetcode.task605;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1 };
        int n = 1;
        boolean expected = true;

        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);
        assertEquals(expected, actual);
    }
}
