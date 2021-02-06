package lcof.task6;

import leetcode.core.ListNode;

import java.util.LinkedList;

/**
 * @see <a href="https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">link</a>
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();

        var p = head;
        while (p != null) {
            list.addFirst(p.val);
            p = p.next;
        }

        int[] result = new int[list.size()];
        int i = 0;
        for (var num : list) {
            result[i++] = num;
        }

        return result;
    }
}
