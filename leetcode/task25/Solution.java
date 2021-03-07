package leetcode.task25;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/reverse-nodes-in-k-group/">link</a>
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode left = head, right;

        while (left != null) {
            right = left;
            boolean end = false;
            for (int i = 0; i < k; i++) {
                if (right == null) {
                    end = true;
                    break;
                }
                right = right.next;
            }
            if (end) {
                break;
            }

            ListNode p = left;
            for (int i = 0; i < k; i++) {
                var nextNode = p.next;
                p.next = prev.next;
                prev.next = p;
                p = nextNode;
            }

            left.next = right;
            prev = left;
            left = right;
        }

        return dummy.next;
    }
}