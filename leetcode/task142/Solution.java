package leetcode.task142;

import leetcode.core.ListNode;

import java.util.HashSet;

/**
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle-ii/">link</a>
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        var p = head;
        while (p != null) {
            set.add(p);
            if (set.contains(p.next)) {
                return p.next;
            }
            p = p.next;
        }

        return null;
    }
}