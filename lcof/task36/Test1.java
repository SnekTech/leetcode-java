package lcof.task36;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void fake1() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(5);

        Solution solution = new Solution();
        var actual = solution.treeToDoublyList(root);
        assertTrue(true);
    }
}
