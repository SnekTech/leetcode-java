package lcof.task6;

import leetcode.core.ListNode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">link</a>
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        int n = 10000;
        int[] arr = new int[n];

        int i = n - 1;
        var p = head;
        while (p != null) {
            arr[i] = p.val;
            p = p.next;
            i--;
        }

        return Arrays.copyOfRange(arr, i + 1, n);
    }
}
