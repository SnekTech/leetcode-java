package leetcode.task160;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode h1 = ListNode.createList(new int[] {4,1,8,4,5});
        ListNode h2 = ListNode.createList(new int[] {5, 0});
        h2.next.next = h1.next;

        Solution solution = new Solution();
        var expected = h1.next;
        var actual = solution.getIntersectionNode(h1, h2);
        assertSame(expected, actual);
    }
}
