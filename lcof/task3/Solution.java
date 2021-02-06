package lcof.task3;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">link</a>
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];

        for (int num : nums) {
            if (count[num] == 0) {
                count[num]++;
            } else {
                return num;
            }
        }

        return nums[0];
    }
}
