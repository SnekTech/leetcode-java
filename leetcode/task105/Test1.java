package leetcode.task105;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[] preorder = new int[] {3,9,20,15,7};
        int[] inorder = new int[] {9,3,15,20,7};

        Solution solution = new Solution();
        var actual = solution.buildTree(preorder, inorder);
        assertTrue(true);
    }
}
