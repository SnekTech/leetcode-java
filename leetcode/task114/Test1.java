package leetcode.task114;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ConstantConditions")
public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        solution.flatten(root);
        assertTrue(true);
    }

    @Test
    public void example2() {
        TreeNode root = null;

        Solution solution = new Solution();
        solution.flatten(root);
        assertTrue(true);
    }

    @Test
    public void example3() {
        TreeNode root = new TreeNode(0);

        Solution solution = new Solution();
        solution.flatten(root);
        assertTrue(true);
    }
}
