package lcof.task21;

/**
 * @see <a href="https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/">link</a>
 */
class Solution {
    public int[] exchange(int[] nums) {
        int n = nums.length;

        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && (nums[i] & 1) == 1) {
                i++;
            }
            while (j >= 0 && (nums[j] & 1) == 0) {
                j--;
            }
            swap(nums, i, j);
            i++;
            j--;
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        if (i < j) {
            var t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}