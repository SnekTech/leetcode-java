package lcof.task22;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">link</a>
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        var p1 = head;
        ListNode p2 = p1;
        for (int i = 1; i < k; i++) {
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}