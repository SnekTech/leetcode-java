package lcof.task27;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        Solution solution = new Solution();
        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(2);
        expected.left.left = new TreeNode(3);
        expected.left.right = new TreeNode(1);
        expected.right.left = new TreeNode(9);
        expected.right.right = new TreeNode(6);
        TreeNode actual = solution.mirrorTree(root);
        assertTrue(TreeNode.AreTreesEqual(expected, actual));
    }
}
