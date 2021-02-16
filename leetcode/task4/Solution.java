package leetcode.task4;

/**
 * @see <a href="https://leetcode-cn.com/problems/median-of-two-sorted-arrays/">link</a>
 */
@SuppressWarnings("UnnecessaryLocalVariable")
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if ((n1 + n2) % 2 == 0) {
            int k = (n1 + n2) / 2;
            double median = (findKth(nums1, nums2, 0, 0, k) + findKth(nums1, nums2, 0, 0, k + 1)) / 2.0;
            return median;
        }
        else {
            int k = (n1 + n2) / 2 + 1;
            double median = findKth(nums1, nums2, 0, 0, k);
            return median;
        }
    }

    private double findKth(int[] nums1, int[] nums2, int start1, int start2, int k) {
        int n1 = nums1.length - start1, n2 = nums2.length - start2;
        if (n1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (n2 == 0) {
            return nums1[start1 + k - 1];
        }

        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int e1 = nums1[Math.min(start1 + k / 2 - 1, start1 + n1 - 1)];
        int e2 = nums2[Math.min(start2 + k / 2 - 1, start2 + n2 - 1)];
        if (e1 <= e2) {
            int offset = Math.min(k / 2, n1);
            return findKth(nums1, nums2, start1 + offset, start2, k - offset);
        }
        else {
            int offset = Math.min(k / 2, n2);
            return findKth(nums1, nums2, start1, start2 + offset, k - offset);
        }
    }
}