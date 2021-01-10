package leetcode.task2;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test1 {
    @Test
    public void example1() {

        var l1 = ListNode.createList(new int[] { 2, 4, 3 });
        var l2 = ListNode.createList(new int[] { 5, 6, 4 });

        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] { 7, 0, 8 });
        ListNode actual = solution.addTwoNumbers(l1, l2);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }

    @Test
    public void wrong1() {

        var l1 = ListNode.createList(new int[] { 9, 9, 9, 9, 9, 9, 9 });
        var l2 = ListNode.createList(new int[] { 9, 9, 9, 9 });

        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 });
        ListNode actual = solution.addTwoNumbers(l1, l2);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }
}
