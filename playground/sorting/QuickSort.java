package playground.sorting;

import static playground.sorting.Utils.swap;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(nums, left, right);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        // [left + 1 ... j] <= pivot
        // [j + 1 ... i) > pivot
        int j = left, i = left + 1;
        while (i <= right) {
            if (nums[i] <= pivot) {
                swap(nums, i, j + 1);
                j++;
            }
            i++;
        }
        swap(nums, left, j);
        return j;
    }

    public static void main(String[] args) {
        Sort sort = new QuickSort();
        int[] nums = new int[] {7, 4, 3, 5, 2, 1};
        sort.sort(nums);
    }
}
