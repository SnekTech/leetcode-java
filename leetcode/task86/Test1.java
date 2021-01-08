package leetcode.task86;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test1 {
    @Test
    public void example() {
        ListNode head = ListNode.createList(new int[] { 1, 4, 3, 2, 5, 2 });
        int x = 3;
        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] { 1, 2, 2, 4, 3, 5 });
        ListNode actual = solution.partition(head, x);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }
}
