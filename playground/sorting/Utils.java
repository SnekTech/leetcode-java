package playground.sorting;

public class Utils {
    public static void swap(int[] nums, int i, int j) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }

        int n = nums.length;

        if (i < 0 || i >= n || j < 0 || j >= n) {
            throw new IllegalArgumentException();
        }

        if (i == j) {
            return;
        }

        var t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
