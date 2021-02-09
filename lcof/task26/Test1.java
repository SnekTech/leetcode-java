package lcof.task26;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        TreeNode A = new TreeNode(3);
        A.left = new TreeNode(4);
        A.right = new TreeNode(5);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(2);

        TreeNode B = new TreeNode(4);
        B.left = new TreeNode(1);

        Solution solution = new Solution();
        boolean actual = solution.isSubStructure(A, B);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        TreeNode A = new TreeNode(3);
        A.left = new TreeNode(4);
        A.right = new TreeNode(5);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(2);

        TreeNode B = new TreeNode(3);
        B.left = new TreeNode(1);

        Solution solution = new Solution();
        boolean actual = solution.isSubStructure(A, B);
        assertFalse(actual);
    }
}
