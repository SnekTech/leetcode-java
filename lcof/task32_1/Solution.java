package lcof.task32_1;

import leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/">link</a>
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>(1000);
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return new int[] {};
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            var node = queue.poll();
            list.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}