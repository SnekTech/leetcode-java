package playground.sorting;

import static playground.sorting.Utils.swap;

public class SelectionSort {
    public static void sort(int[] nums) {
        if (nums == null) {
            return;
        }
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            swap(nums, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1 ,3, 4, 2};
        sort(nums);
    }
}
