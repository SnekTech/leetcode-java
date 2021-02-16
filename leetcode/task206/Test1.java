package leetcode.task206;

import leetcode.core.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        ListNode head = ListNode.createList(new int[] {1, 2, 3, 4, 5});

        Solution solution = new Solution();
        var actual = solution.reverseList(head);
        assertTrue(true);
    }
}
