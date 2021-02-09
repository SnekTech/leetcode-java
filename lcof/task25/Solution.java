package lcof.task25;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/">link</a>
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        var dummy = new ListNode(-1);
        dummy.next = l1;
        var p1 = dummy;
        var p2 = l2;

        while (p1.next != null && p2 != null) {
            var value1 = p1.next.val;
            var value2 = p2.val;
            if (value1 >= value2) {
                var t = p2.next;
                p2.next = p1.next;
                p1.next = p2;
                p2 = t;
            }
            else {
                p1 = p1.next;
            }
        }

        if (p1.next == null && p2 != null) {
            p1.next = p2;
        }

        return dummy.next;
    }
}