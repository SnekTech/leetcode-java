package lcof.task32_3;

import leetcode.core.TreeNode;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/">link</a>
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        boolean isGoingForward = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                var node = queue.remove();
                if (isGoingForward) {
                    list.add(node.val);
                }
                else {
                    list.add(0, node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            isGoingForward = !isGoingForward;
            result.add(list);
        }

        return result;
    }
}