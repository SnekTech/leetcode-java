package leetcode.task92;

import static leetcode.core.ListNode.areListsEqual;
import static leetcode.core.ListNode.createList;
import static org.junit.Assert.assertTrue;

import leetcode.core.ListNode;
import org.junit.Test;

public class Test1 {
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
