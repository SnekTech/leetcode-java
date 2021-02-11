package lcof.task32_2;

import leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/">link</a>
 */
class Solution {
    static class NodeWithLevel {
        TreeNode node;
        int level;

        public NodeWithLevel(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<NodeWithLevel> queue = new LinkedList<>();
        queue.add(new NodeWithLevel(root, 1));
        int prevLevel = 0;
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            var current = queue.poll();
            var node = current.node;
            if (current.level != prevLevel) {
                prevLevel = current.level;
                list = new ArrayList<>();
                result.add(list);
            }
            list.add(node.val);

            if (node.left != null) {
                queue.add(new NodeWithLevel(node.left, current.level + 1));
            }
            if (node.right != null) {
                queue.add(new NodeWithLevel(node.right, current.level + 1));
            }
        }

        return result;
    }
}