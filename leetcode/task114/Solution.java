package leetcode.task114;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/">link</a>
 */
class Solution {
    public void flatten(TreeNode root) {
        flattenReturnTail(root);
    }

    TreeNode flattenReturnTail(TreeNode root) {
        if (root == null) {
            return null;
        }

        var originRight = root.right;
        var leftTail = flattenReturnTail(root.left);
        if (leftTail != null) {
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        var rightTail = flattenReturnTail(originRight);
        return rightTail != null ? rightTail : leftTail != null ? leftTail : root;
    }
}