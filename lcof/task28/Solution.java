package lcof.task28;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}