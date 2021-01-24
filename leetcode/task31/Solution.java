package leetcode.task31;

/**
 * @see <a href="https://leetcode-cn.com/problems/next-permutation/">link</a>
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        if (n <= 1) {
            return;
        }

        int left = n - 2;
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        if (left != -1) {
            int right = n - 1;
            while (nums[right] <= nums[left]) {
                right--;
            }
            swap(nums, left, right);
        }

        reverse(nums, left + 1, n - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        var t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static void reverse(int[] arr, int start, int end) {
        int i = start, j = end;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
