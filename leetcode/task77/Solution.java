package leetcode.task77;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href=https://leetcode-cn.com/problems/combinations/">link</a>
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;

        backTrack(1);

        return result;
    }

    void backTrack(int i) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int j = i; j <= n; j++) {
            current.add(j);
            backTrack(j + 1);
            current.remove(current.size() - 1);
        }
    }
}
