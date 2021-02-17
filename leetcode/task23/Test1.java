package leetcode.task23;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode l1 = ListNode.createList(new int[] {1, 4, 5});
        ListNode l2 = ListNode.createList(new int[] {1, 3, 4});
        ListNode l3 = ListNode.createList(new int[] {2, 6});
        ListNode[] lists = new ListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] {1,1,2,3,4,4,5,6});
        ListNode actual = solution.mergeKLists(lists);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }

    @Test
    public void example2() {
        ListNode[] lists = new ListNode[0];

        Solution solution = new Solution();
        ListNode actual = solution.mergeKLists(lists);
        assertNull(actual);
    }

    @Test
    public void example3() {
        ListNode[] lists = new ListNode[1];
        lists[0] = null;

        Solution solution = new Solution();
        ListNode actual = solution.mergeKLists(lists);
        assertNull(actual);
    }
}
