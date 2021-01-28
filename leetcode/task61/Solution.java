package leetcode.task61;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/rotate-list/">link</a>
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 0;
        for (ListNode p = head; p != null; p = p.next) {
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }

        int count = 0;
        ListNode newTail = null;
        for (ListNode p = head; p != null; p = p.next) {
            count++;
            if (count == length - k) {
                newTail = p;
                break;
            }
        }
        assert newTail != null;

        ListNode oldTail = null;
        for (var p = newTail.next; p != null; p = p.next) {
            if (p.next == null) {
                oldTail = p;
            }
        }
        assert oldTail != null;

        oldTail.next = head;
        head = newTail.next;
        newTail.next = null;

        return head;
    }
}
