package leetcode.task24;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">link</a>
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        return swap(head);
    }

    private ListNode swap(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        var second = head.next;
        head.next = swap(second.next);
        second.next = head;
        return second;
    }
}
