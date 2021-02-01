package leetcode.task98;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">link</a>
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if (min != null && val <= min) {
            return false;
        }
        if (max != null && val >= max) {
            return false;
        }

        return dfs(node.left, min, val) && dfs(node.right, val, max);
    }
}
