package leetcode.task102;

import leetcode.core.TreeNode;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> line = new ArrayList<>();
            int lineSize = queue.size();
            for (int i = 0; i < lineSize; i++) {
                var node = queue.remove();
                // access
                line.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(line);
        }

        return result;
    }
}