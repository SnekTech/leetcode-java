package lcof.task68_1;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings({"UnnecessaryLocalVariable", "DuplicatedCode"})
public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left, q = root.right;

        Solution solution = new Solution();
        TreeNode expected = root;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left, q = root.left.right;

        Solution solution = new Solution();
        TreeNode expected = root;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(expected, actual);
    }
}
