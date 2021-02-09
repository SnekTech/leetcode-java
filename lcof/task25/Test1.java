package lcof.task25;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void wrong1() {
        ListNode l1 = ListNode.createList(new int[] {1,2,4});
        ListNode l2 = ListNode.createList(new int[] {1,3,4});

        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] {1,1,2,3,4,4});
        ListNode actual = solution.mergeTwoLists(l1, l2);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }

    @Test
    public void wrong2() {
        ListNode l1 = ListNode.createList(new int[] {5});
        ListNode l2 = ListNode.createList(new int[] {1,2,4});

        Solution solution = new Solution();
        ListNode expected = ListNode.createList(new int[] {1,2,4,5});
        ListNode actual = solution.mergeTwoLists(l1, l2);
        assertTrue(ListNode.areListsEqual(expected, actual));
    }
}
