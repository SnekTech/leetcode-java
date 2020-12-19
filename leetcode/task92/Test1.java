package leetcode.task92;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import leetcode.task92.Solution.ListNode;

public class Test1 {
    private static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (int i = 0; i < arr.length; i++, p = p.next) {
            p.next = new ListNode(arr[i]);
        }
        return dummy.next;
    }

    private static boolean areListsEqual(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1 == null && p2 == null;
    }

    @Test
    public void wrong1() {

        ListNode head = createList(new int[] {3, 5});
        int m = 1;
        int n = 2;
        Solution solution = new Solution();
        ListNode expected = createList(new int[] {5, 3});
        ListNode actual = solution.reverseBetween(head, m, n);
        assertTrue(areListsEqual(expected, actual));
    }
}
