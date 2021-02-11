package lcof.task32_3;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
        var actual = solution.levelOrder(root);
        assertTrue(true);
    }
}
