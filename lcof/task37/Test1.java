package lcof.task37;

import leetcode.core.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1a() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Codec codec = new Codec();
        String expected = "[1,2,3,null,null,4,5]";
        String actual = codec.serialize(root);
        assertEquals(expected, actual);
    }

    @Test
    public void example1b() {
        String data = "[1,2,3,null,null,4,5]";

        Codec codec = new Codec();
        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.right.left = new TreeNode(4);
        expected.right.right = new TreeNode(5);
        var actual = codec.deserialize(data);
        assertTrue(TreeNode.areTreesEqual(expected, actual));
    }
}
