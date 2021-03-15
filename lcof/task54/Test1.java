package lcof.task54;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;

        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.kthLargest(root, k);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        int k = 3;

        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.kthLargest(root, k);
        assertEquals(expected, actual);
    }
}
