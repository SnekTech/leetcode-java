package leetcode.task142;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        ListNode head = ListNode.createList(new int[] {3, 2, 0, -4});
        head.next.next.next.next = head.next;

        Solution solution = new Solution();
        ListNode expected = head.next;
        ListNode actual = solution.detectCycle(head);
        assertSame(expected, actual);
    }

    @Test
    public void example2() {
        ListNode head = ListNode.createList(new int[] {1, 2});
        head.next.next = head;

        Solution solution = new Solution();
        //noinspection UnnecessaryLocalVariable
        ListNode expected = head;
        ListNode actual = solution.detectCycle(head);
        assertSame(expected, actual);
    }

    @Test
    public void example3() {
        ListNode head = ListNode.createList(new int[] {1});

        Solution solution = new Solution();
        ListNode actual = solution.detectCycle(head);
        assertSame(null, actual);
    }
}
