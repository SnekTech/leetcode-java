package lcof.task35;

import lcof.common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/">link</a>
 */
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();
        map.put(null, null);
        var dummy = new Node(-1);
        var p = head;
        var prev = dummy;
        while (p != null) {
            prev.next = new Node(p.val);
            map.put(p, prev.next);
            prev = prev.next;
            p = p.next;
        }

        p = head;
        var p2 = dummy.next;
        while (p != null) {
            p2.random = map.get(p.random);
            p = p.next;
            p2 = p2.next;
        }

        return dummy.next;
    }
}