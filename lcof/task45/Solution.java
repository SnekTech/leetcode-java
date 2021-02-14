package lcof.task45;

import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/">link</a>
 */
class Solution {
    public String minNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> (a + b).compareTo(b + a));

        for (var num : nums) {
            queue.add(Integer.toString(num));
        }
        StringBuilder res = new StringBuilder();
        while(!queue.isEmpty()) {
            res.append(queue.poll());
        }
        return res.toString();
    }
}