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

        var p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}