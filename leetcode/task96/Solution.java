package leetcode.task96;

/**
 * @see <a href="https://leetcode-cn.com/problems/unique-binary-search-trees/">link</a>
 */
public class Solution {
    public int numTrees(int n) {
        return dfs(1, n);
    }

    private int dfs(int min, int max) {
        if (min >= max) {
            return 1;
        }
        if (min == max - 1) {
            return 2;
        }
        if (min == max - 2) {
            return 5;
        }

        int count = 0;

        for (int i = min; i <= max; i++) {
            int leftCount = dfs(min, i - 1);
            int rightCount = dfs(i + 1, max);
            count += leftCount * rightCount;
        }

        return count;
    }
}
