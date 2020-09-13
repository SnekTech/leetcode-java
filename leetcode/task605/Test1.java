package leetcode.task605;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1 };
        int n = 1;

        boolean expected = true;
        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1 };
        int n = 2;

        boolean expected = false;
        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);

        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 0, 1 };
        int n = 2;

        boolean expected = false;
        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);

        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        int[] flowerbed = new int[] { 1, 0, 0, 0, 1, 0, 0 };
        int n = 2;

        boolean expected = true;
        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);

        assertEquals(expected, actual);
    }

    @Test
    public void wrong3() {
        int[] flowerbed = new int[] { 0 };
        int n = 1;

        boolean expected = true;
        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);

        assertEquals(expected, actual);
    }

    @Test
    public void wrong4() {
        int[] flowerbed = new int[] { 1, 0 };
        int n = 1;

        boolean expected = false;
        boolean actual = new Solution().canPlaceFlowers(flowerbed, n);

        assertEquals(expected, actual);
    }
}
