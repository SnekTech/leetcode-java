package leetcode.task129;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">link</a>
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }

        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }
}