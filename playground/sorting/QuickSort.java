package playground.sorting;

import java.util.Random;

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

        int pivot = partition2(nums, left, right);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }

    private void quickSort3Ways(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        swap(nums, left, left + new Random().nextInt(right - left + 1));

        int pivot = nums[left];

        int lt = left; // [left + 1 ... lt] < pivot
        int i = lt + 1; // [lt + 1 ... i) == pivot
        int gt = right + 1; // [gt ... right] > pivot

        while (i < gt) {
            if (nums[i] < pivot) {
                swap(nums, i, lt + 1);
                lt++;
                i++;
            }
            else if (nums[i] > pivot) {
                swap(nums, i, gt - 1);
                gt--;
            }
            else {
                i++;
            }
        }
        swap(nums, left, lt);

        quickSort3Ways(nums, left, lt - 1);
        quickSort3Ways(nums, gt, right);
    }

    private int partition(int[] nums, int left, int right) {
        swap(nums, left, left + new Random().nextInt(right - left + 1));

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

    private int partition2(int[] nums, int left, int right) {
        swap(nums, left, left + new Random().nextInt(right - left + 1));

        int pivot = nums[left];
        // [left + 1 ... i) <= pivot
        // (j ... right] >= pivot
        int i = left + 1, j = right;
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

    public static void main(String[] args) {
        Sort sort = new QuickSort();
        int[] nums = new int[] {7, 4, 3, 5, 2, 1};
        sort.sort(nums);
    }
}
