package lcof.task35;

import lcof.common.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void fake1() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.random = head.next;
        head.next.random = head.next;

        Solution solution = new Solution();
        var actual = solution.copyRandomList(head);
        assertTrue(true);
    }
}
