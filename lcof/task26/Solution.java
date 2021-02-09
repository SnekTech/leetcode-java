package lcof.task26;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/">link</a>
 */
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        if (A.val == B.val) {
            if (isSubFromTop(A, B)) {
                return true;
            }
        }

        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSubFromTop(TreeNode tree1, TreeNode tree2) {
        if (tree2 == null) {
            return true;
        }
        if (tree1 == null) {
            return false;
        }

        return tree1.val == tree2.val && isSubFromTop(tree1.left, tree2.left) && isSubFromTop(tree1.right, tree2.right);
    }
}