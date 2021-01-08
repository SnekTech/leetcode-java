package leetcode.task86;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/partition-list/">link</a>
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        var dummy1 = new ListNode(-1, null);
        var dummy2 = new ListNode(-1, null);
        var p1 = dummy1;
        var p2 = dummy2;

        var p = head;
        while (p != null) {
            if (p.val < x) {
                p1.next = new ListNode(p.val, p1.next);
                p1 = p1.next;
            }
            else {
                p2.next = new ListNode(p.val, p2.next);
                p2 = p2.next;
            }
            p = p.next;
        }

        p1.next = dummy2.next;

        return dummy1.next;
    }
}
