package leetcode.task2;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers/">link</a>
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var p1 = l1;
        var p2 = l2;

        var dummy = new ListNode(-1);
        var prev = dummy;
        var carry = 0;

        while (p1 != null || p2 != null) {
            int a = p1 == null ? 0 : p1.val;
            int b = p2 == null ? 0 : p2.val;
            int digit = a + b + carry;
            carry = digit >= 10 ? 1 : 0;
            digit %= 10;
            prev.next = new ListNode(digit, prev.next);
            prev = prev.next;

            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }

        if (carry > 0) {
            prev.next = new ListNode(1, prev.next);
        }

        return dummy.next;
    }
}