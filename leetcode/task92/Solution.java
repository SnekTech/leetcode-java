package leetcode.task92;

/**
 * @see <a href="https://leetcode-cn.com/problems/reverse-linked-list-ii/">link</a>
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null || m == n) return head;

        int i = 0;
        ListNode dummy = new ListNode(-1); // dummy head
        dummy.next = head;
        ListNode p = dummy;
        ListNode beforeStart = p;
        ListNode end = beforeStart.next;
        ListNode afterEnd = null;
        while (p != null) {

            ListNode nextToGo = p.next;

            if (i == m - 1) {
                // found the node before start
                beforeStart = p;
                end = p.next;
            }

            if (i > m && i <= n) {
                // insert to local head(beforeStart)
                p.next = beforeStart.next;
                beforeStart.next = p;
            }

            if (i == n + 1) {
                afterEnd = p;
            }

            p = nextToGo;
            i++;
        }

        end.next = afterEnd;

        return dummy.next;
    }
}
