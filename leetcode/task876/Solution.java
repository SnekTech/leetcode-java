package leetcode.task876;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/middle-of-the-linked-list/">link</a>
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        var dummy = new ListNode(-1);
        dummy.next = head;
        var p1 = dummy;
        var p2 = dummy;

        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next != null ? p2.next.next : null;
        }

        return p1;
    }
}