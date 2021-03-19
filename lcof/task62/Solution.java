package lcof.task62;

import java.util.ArrayList;

/**
 * @see <a href="https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/">link</a>
 */
class Solution {
    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            int deleteIndex = (index + m - 1) % list.size();
            list.remove(deleteIndex);
            index = deleteIndex % list.size();
        }

        return list.get(0);
    }
}