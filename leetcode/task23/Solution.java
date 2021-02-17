package leetcode.task23;

import leetcode.core.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/merge-k-sorted-lists/">link</a>
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0) {
            return null;
        }

        int k = n;
        for (ListNode list : lists) {
            if (list == null) {
                k--;
            }
        }

        if (k == 0) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>(
                Comparator.comparingInt(a -> a.val)
        );

        ListNode dummy = new ListNode(0);
        var prev = dummy;
        for (var node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        while (!queue.isEmpty()) {
            var node = queue.poll();
            if (node.next != null) {
                queue.add(node.next);
            }
            prev.next = node;
            node.next = null;
            prev = prev.next;
        }

        return dummy.next;
    }
}