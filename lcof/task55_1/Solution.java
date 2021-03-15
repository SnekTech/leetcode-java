package lcof.task55_1;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/">link</a>
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return max(root);
    }

    int max(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(max(root.left), max(root.right)) + 1;
    }
}