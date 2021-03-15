package lcof.task55_2;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/">link</a>
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.left) - height(root.right)) <= 1;
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}