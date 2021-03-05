package leetcode.task124;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        int expected = 42;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }
}
