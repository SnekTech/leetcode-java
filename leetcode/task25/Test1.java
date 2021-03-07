package leetcode.task25;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode head = ListNode.createList(new int[] {1,2,3,4,5});
        int k = 2;

        Solution solution = new Solution();
        var actual = solution.reverseKGroup(head, k);
        assertTrue(true);
    }

    @Test
    public void example2() {
        ListNode head = ListNode.createList(new int[] {1,2,3,4,5});
        int k = 3;

        Solution solution = new Solution();
        var actual = solution.reverseKGroup(head, k);
        assertTrue(true);
    }

    @Test
    public void example3() {
        ListNode head = ListNode.createList(new int[] {1,2,3,4,5});
        int k = 1;

        Solution solution = new Solution();
        var actual = solution.reverseKGroup(head, k);
        assertTrue(true);
    }

    @Test
    public void example4() {
        ListNode head = ListNode.createList(new int[] {1});
        int k = 1;

        Solution solution = new Solution();
        var actual = solution.reverseKGroup(head, k);
        assertTrue(true);
    }
}
