package lcof.task60;

import java.util.Map;
import java.util.TreeMap;

/**
 * @see <a href="https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/">link</a>
 */
class Solution {
    Map<Integer, Integer> map = new TreeMap<>();
    public double[] dicesProbability(int n) {
        // 2 3 4 5 6 7 8 9 10 11 12
        backTrack(n, 1, 0);
        double total = 0;
        for (var entry : map.entrySet()) {
            total += entry.getValue();
        }
        double[] ans = new double[map.size()];
        int i = 0;
        for (var entry : map.entrySet()) {
            ans[i] = entry.getValue() / total;
            i++;
        }

        return ans;
    }

    void backTrack(int n, int pos, int sum) {
        if (pos > n) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            backTrack(n, pos + 1, sum + i);
        }
    }
}