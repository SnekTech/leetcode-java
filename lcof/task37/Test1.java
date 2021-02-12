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

    @Test
    public void wrong1() {
        String data = "[1,2]";

        Codec codec = new Codec();
        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        var actual = codec.deserialize(data);
        assertTrue(TreeNode.areTreesEqual(expected, actual));
    }

    @Test
    public void wrong2() {
        String data = "[5,2,3,null,null,2,4,3,1]";

        Codec codec = new Codec();
        TreeNode expected = new TreeNode(5);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.right.left = new TreeNode(2);
        expected.right.right = new TreeNode(4);
        expected.right.left.left = new TreeNode(3);
        expected.right.left.right = new TreeNode(1);

        var actual = codec.deserialize(data);
        assertTrue(TreeNode.areTreesEqual(expected, actual));
    }

    @Test
    public void wrong3() {
        String data = "[2,null,3,null,4,null,5,null,6]";

        Codec codec = new Codec();
        TreeNode expected = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.right.right = new TreeNode(4);
        expected.right.right.right = new TreeNode(5);
        expected.right.right.right.right = new TreeNode(6);

        var actual = codec.deserialize(data);
        assertTrue(TreeNode.areTreesEqual(expected, actual));
    }

    @Test
    public void wrong4() {
        String data = "[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null]";

        Codec codec = new Codec();
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(2);
        expected.right.right = new TreeNode(3);
        expected.right.right.right = new TreeNode(4);
        expected.right.right.right.right = new TreeNode(5);
        expected.right.right.right.right.right = new TreeNode(6);
        expected.right.right.right.right.right.right = new TreeNode(7);
        expected.right.right.right.right.right.right.right = new TreeNode(8);

        var actual = codec.deserialize(data);
        assertTrue(TreeNode.areTreesEqual(expected, actual));
    }
}
