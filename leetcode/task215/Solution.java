package leetcode.task215;

import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/kth-largest-element-in-an-array/">link</a>
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k); // min-root

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                queue.offer(nums[i]);
            }
            else {
                queue.offer(nums[i]);
                queue.poll();
            }
        }

        assert !queue.isEmpty();

        return queue.peek();
    }
}