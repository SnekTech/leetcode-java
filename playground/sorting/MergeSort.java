package playground.sorting;

public class MergeSort implements Sort {
    public void sort(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }

        mergeSort(nums, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid || j <= right) {
            if (i > mid) {
                tmp[k++] = nums[j++];
            }
            else if (j > right) {
                tmp[k++] = nums[i++];
            }
            else if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            }
            else {
                tmp[k++] = nums[j++];
            }
        }

        //noinspection ManualArrayCopy
        for (int idx = left; idx <= right; idx++) {
            nums[idx] = tmp[idx - left];
        }
    }

    public static void main(String[] args) {
        Sort sort = new MergeSort();

        int[] nums = new int[] {3, 2, 1, 5};
        sort.sort(nums);
    }
}
