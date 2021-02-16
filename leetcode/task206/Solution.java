package leetcode.task206;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/reverse-linked-list/">link</a>
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var dummy = new ListNode(0, head);
        var p = head;
        while (p != null) {
            var next = p.next;
            p.next = dummy.next;
            dummy.next = p;
            p = next;
        }
        head.next = null;

        return dummy.next;
    }
}