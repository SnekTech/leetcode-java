package leetcode.task148;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode head = ListNode.createList(new int[] {4, 2, 1, 3});

        Solution solution = new Solution();
        var actual = solution.sortList(head);
        assertTrue(ListNode.areListsEqual(ListNode.createList(new int[] {1, 2, 3, 4}), actual));
    }
}
