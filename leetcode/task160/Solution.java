package leetcode.task160;

import leetcode.core.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-linked-lists/">link</a>
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Set<ListNode> set = new HashSet<>();

        var p = headA;
        while (p != null) {
            set.add(p);
            p = p.next;
        }

        p = headB;
        while (p != null) {
            if (set.contains(p)) {
                return p;
            }
            p = p.next;
        }

        return null;
    }
}