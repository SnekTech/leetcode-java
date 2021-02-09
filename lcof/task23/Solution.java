package lcof.task23;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/">link</a>
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        var dummy = new ListNode(-1);

        var p = head;
        while (p != null) {
            var t = p.next;
            p.next = dummy.next;
            dummy.next = p;
            p = t;
        }

        return dummy.next;
    }
}