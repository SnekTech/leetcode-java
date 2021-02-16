package leetcode.task141;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle/">link</a>
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}