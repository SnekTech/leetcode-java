package lcof.task52;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        ListNode headA = ListNode.createList(new int[] {4,1,8,4,5});
        ListNode headB = ListNode.createList(new int[] {5,0,1});
        headB.next.next.next = headA.next.next;

        Solution solution = new Solution();
        var actual = solution.getIntersectionNode(headA, headB);
        assertTrue(true);
    }
}
