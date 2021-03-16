package lcof.task59_1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @see <a href="https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/">link</a>
 */
@SuppressWarnings("ConstantConditions")
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[n - k + 1];

        for (int i = 1 - k, j = 0; j < n; i++, j++) {
            if (i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);

            if (i >= 0) {
                res[i] = deque.peekFirst();
            }
        }

        return res;
    }
}