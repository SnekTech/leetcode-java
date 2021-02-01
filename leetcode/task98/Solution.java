package leetcode.task98;

import leetcode.core.TreeNode;

import java.util.TreeSet;

/**
 * @see <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">link</a>
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        return dfs(root, treeSet);
    }

    private boolean dfs(TreeNode root, TreeSet<Integer> treeSet) {
        if (root == null) {
            return true;
        }

        TreeSet<Integer> leftValues = new TreeSet<>();

        boolean leftValid = dfs(root.left, leftValues);
        if (!leftValid) {
            return false;
        }
        if (!leftValues.isEmpty() && leftValues.last() >= root.val) {
            return false;
        }

        TreeSet<Integer> rightValues = new TreeSet<>();
        boolean rightValid = dfs(root.right, rightValues);
        if (!rightValid) {
            return false;
        }
        if (!rightValues.isEmpty() && rightValues.first() <= root.val) {
            return false;
        }
        treeSet.add(root.val);
        treeSet.addAll(leftValues);
        treeSet.addAll(rightValues);

        return true;
    }
}
