package leetcode.task148;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/sort-list/">link</a>
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummy = new ListNode(0, head);
        for (int size = 1; size < length; size <<= 1) {
            ListNode prev = dummy, current = dummy.next;
            while (current != null) {
                ListNode head1 = current;
                for (int i = 1; i < size && current.next != null; i++) {
                    current = current.next;
                }
                ListNode head2 = current.next;
                current.next = null;
                current = head2;
                for (int i = 1; i < size && current != null && current.next != null; i++) {
                    current = current.next;
                }

                ListNode next = null;
                if (current != null) {
                    next = current.next;
                    current.next = null;
                }

                prev.next = merge(head1, head2);
                while (prev.next != null) {
                    prev = prev.next;
                }
                current = next;
            }
        }

        return dummy.next;
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return null;
        }

        if (head.next == tail) {
            head.next = null;
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }

        ListNode mid = slow;
        ListNode l1 = sortList(head, mid);
        ListNode l2 = sortList(mid, tail);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy, p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            }
            else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        else if (p2 != null) {
            p.next = p2;
        }

        return dummy.next;
    }
}