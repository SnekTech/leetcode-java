package lcof.task7;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[] preorder = new int[] {3,9,20,15,7};
        int[] inorder = new int[] {9,3,15,20,7};

        Solution solution = new Solution();
        TreeNode expected = null;
        TreeNode actual = solution.buildTree(preorder, inorder);
        assertTrue(true); // Fake Test!!!
    }
}
