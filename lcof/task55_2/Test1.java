package lcof.task55_2;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("DuplicatedCode")
public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        Solution solution = new Solution();
        boolean actual = solution.isBalanced(root);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        Solution solution = new Solution();
        boolean actual = solution.isBalanced(root);
        assertFalse(actual);
    }
}
