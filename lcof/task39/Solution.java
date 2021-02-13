package lcof.task39;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/">link</a>
 */
class Solution {
    public int majorityElement(int[] nums) {
        int major = -1;
        int vote = 0;

        for (var num : nums) {
            if (vote == 0) {
                major = num;
            }

            if (major == num) {
                vote++;
            }
            else {
                vote--;
            }
        }

        return major;
    }
}