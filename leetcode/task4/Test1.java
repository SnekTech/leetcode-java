package leetcode.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2};

        Solution solution = new Solution();
        double expected = 2;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void example2() {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};

        Solution solution = new Solution();
        double expected = 2.5;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void example3() {
        int[] nums1 = new int[] {0,0};
        int[] nums2 = new int[] {0,0};

        Solution solution = new Solution();
        double expected = 0;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void example4() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {1};

        Solution solution = new Solution();
        double expected = 1;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void example5() {
        int[] nums1 = new int[] {2};
        int[] nums2 = new int[] {};

        Solution solution = new Solution();
        double expected = 2;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }
}
