package leetcode.task257;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        
        Solution solution = new Solution();
        var actual = solution.binaryTreePaths(root);
        assertTrue(true);
    }
}
