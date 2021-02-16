package leetcode.task215;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @see <a href="https://leetcode-cn.com/problems/kth-largest-element-in-an-array/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Solution {
    Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return find(nums, 0, n - 1, n - k);
    }

    private int find(int[] nums, int left, int right, int targetIndex) {
        int p = partition(nums, left, right);
        if (p == targetIndex) {
            return nums[p];
        }
        else {
            return p > targetIndex ? find(nums, left, p - 1, targetIndex) : find(nums, p + 1, right, targetIndex);
        }
    }

    private int partition(int[] nums, int left, int right) {
        swap(nums, left, left + random.nextInt(right - left + 1));

        int i = left + 1, j = right;
        int pivot = nums[left];
        while (true) {
            while (i <= right && nums[i] < pivot) i++;
            while (j >= left + 1 && nums[j] > pivot) j--;

            if (i > j) {
                break;
            }

            swap(nums, i, j);
            i++;
            j--;
        }
        swap(nums, left, j);

        return j;
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }

        var t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}