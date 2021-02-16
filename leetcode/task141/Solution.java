package leetcode.task141;

import leetcode.core.ListNode;

import java.util.HashSet;

/**
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle/">link</a>
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        var p = head;
        while (p != null) {
            set.add(p);
            if (set.contains(p.next)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }
}