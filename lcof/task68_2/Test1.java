package lcof.task68_2;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings({"UnnecessaryLocalVariable", "DuplicatedCode"})
public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode p = root.left, q = root.right;

        Solution solution = new Solution();
        TreeNode expected = root;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode p = root.left, q = root.left.right.right;

        Solution solution = new Solution();
        TreeNode expected = p;
        TreeNode actual = solution.lowestCommonAncestor(root, p, q);
        assertEquals(expected, actual);
    }
}
