package lcof.task40;

import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/">link</a>
 */
@SuppressWarnings("ConstantConditions")
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ans = new int[k];
        if (k == 0) {
            return ans;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }

        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll();
        }

        return ans;
    }
}