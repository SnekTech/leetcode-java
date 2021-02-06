package lcof.task11;

/**
 * @see <a href="https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/">link</a>
 */
class Solution {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            }
            else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            }
            else {
                high--;
            }
        }

        return numbers[low];
    }
}