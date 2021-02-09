package lcof.task27;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/">link</a>
 */
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = mirrorTree(root.left);
        root.right = mirrorTree(root.right);

        var t = root.left;
        root.left = root.right;
        root.right = t;

        return root;
    }
}