package leetcode.task179;

import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/largest-number/">link</a>
 */
class Solution {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));

        for (var x: nums) {
            queue.offer(Integer.toString(x));
        }
        StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            builder.append(queue.poll());
        }

        int start = 0;
        while (builder.charAt(start) == '0' && start != builder.length() - 1) {
            start++;
        }

        return builder.substring(start);
    }
}