package lcof.task18;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/">link</a>
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        var dummy = new ListNode(-1);
        dummy.next = head;

        var previous = dummy;
        while (previous.next != null) {
            if (previous.next.val == val) {
                previous.next = previous.next.next;
                break;
            }
            previous = previous.next;
        }

        return dummy.next;
    }
}