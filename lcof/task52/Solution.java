package lcof.task52;

import leetcode.core.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/">link</a>
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        boolean isP1PointingA = true, isP2PointingB = true;

        while (p1 != null || p2 != null) {
            if (p1 == p2) {
                return p1;
            }

            if (p1 == null) {
                p1 = isP1PointingA ? headB : headA;
                isP1PointingA = !isP1PointingA;
            }
            else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = isP2PointingB ? headA : headB;
                isP2PointingB = !isP2PointingB;
            }
            else {
                p2 = p2.next;
            }

        }

        return null;
    }
}