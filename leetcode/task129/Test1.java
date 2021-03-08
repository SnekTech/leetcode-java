package leetcode.task129;

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
        int expected = 25;
        int actual = solution.sumNumbers(root);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        Solution solution = new Solution();
        int expected = 1026;
        int actual = solution.sumNumbers(root);
        assertEquals(expected, actual);
    }
}
