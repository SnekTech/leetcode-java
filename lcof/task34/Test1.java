package lcof.task34;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        int sum = 22;

        Solution solution = new Solution();
        var actual = solution.pathSum(root, sum);
        assertTrue(true);
    }

    @Test
    public void wrong1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int sum = 1;

        Solution solution = new Solution();
        var actual = solution.pathSum(root, sum);
        assertTrue(true);
    }

    @Test
    public void wrong2() {
        TreeNode root = new TreeNode(-2);
        root.right = new TreeNode(-3);
        int sum = -5;

        Solution solution = new Solution();
        var actual = solution.pathSum(root, sum);
        assertTrue(true);
    }
}
