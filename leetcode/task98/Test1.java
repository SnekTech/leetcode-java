package leetcode.task98;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        Solution solution = new Solution();
        boolean actual = solution.isValidBST(root);
        assertTrue(actual);
    }
}
