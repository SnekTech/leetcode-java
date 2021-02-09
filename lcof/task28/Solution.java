package lcof.task28;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Solution {
    public boolean isSymmetric(TreeNode root) {
        TreeNode mirror = mirrorTreeImmutable(root);

        return AreTreesEqual(root, mirror);
    }

    public TreeNode mirrorTreeImmutable(TreeNode root) {
        if (root == null) {
            return null;
        }

        var ret = new TreeNode(root.val);

        ret.left = mirrorTreeImmutable(root.left);
        ret.right = mirrorTreeImmutable(root.right);

        var t = ret.left;
        ret.left = ret.right;
        ret.right = t;

        return ret;
    }

    public static boolean AreTreesEqual(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }

        return tree1.val == tree2.val && AreTreesEqual(tree1.left, tree2.left) && AreTreesEqual(tree1.right, tree2.right);
    }
}