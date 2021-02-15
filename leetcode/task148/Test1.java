package leetcode.task148;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode head = ListNode.createList(new int[] {4, 2, 1, 3});

        Solution solution = new Solution();
        var expected = ListNode.createList(new int[] {1, 2, 3, 4});
        var actual = solution.sortList(head);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }

    @Test
    public void example2() {
        ListNode head = ListNode.createList(new int[] {-1,5,3,4,0});

        Solution solution = new Solution();
        var expected = ListNode.createList(new int[] {-1,0,3,4,5});
        var actual = solution.sortList(head);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }
}
