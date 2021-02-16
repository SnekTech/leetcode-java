package leetcode.task328;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/odd-even-linked-list/">link</a>
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //[1, 3, ..., slow, 2, 4, ..., fast, p, ...]
        ListNode slow = head, fast = head.next, p = fast.next;
        boolean isOdd = true;

        while (p != null) {

            if (isOdd) {
                var nextP = p.next;
                p.next = slow.next;
                slow.next = p;
                slow = p;
                fast.next = nextP;
                p = nextP;
            }
            else {
                fast = p;
                p = p.next;
            }
            isOdd = !isOdd;
        }

        return head;
    }
}