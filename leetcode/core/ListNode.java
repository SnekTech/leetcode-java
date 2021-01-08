package leetcode.core;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static boolean areListsEqual(ListNode l1, ListNode l2) {
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

    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (int i = 0; i < arr.length; i++, p = p.next) {
            p.next = new ListNode(arr[i]);
        }
        return dummy.next;
    }
}
