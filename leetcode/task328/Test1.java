package leetcode.task328;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode head = ListNode.createList(new int[] {1, 2, 3, 4, 5});

        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] {1, 3, 5, 2, 4});
        ListNode actual = solution.oddEvenList(head);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }
}
