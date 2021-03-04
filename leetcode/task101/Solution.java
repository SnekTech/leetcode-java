package leetcode.task101;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/symmetric-tree/">link</a>
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }

        if (tree1.val != tree2.val) {
            return false;
        }

        return isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
    }
}