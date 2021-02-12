package lcof.task37;

import leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/">link</a>
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        str.append('[');
        if (root == null) {
            str.append(']');
            return str.toString();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var node = queue.remove();
            list.addLast(node);

            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        while (list.peekLast() == null) {
            list.removeLast();
        }

        while (!list.isEmpty()) {
            var node = list.removeFirst();
            if (node == null) {
                str.append("null");
            }
            else {
                str.append(node.val);
            }

            if (!list.isEmpty()) {
                str.append(',');
            }
        }

        str.append(']');

        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }
        data = data.substring(1, data.length() - 1);
        var raw = data.split(",");
        int n = raw.length;

        // 此处前后各多加一个元素 null
        // 前者为了调整索引值，方便计算二叉树左右孩子索引
        // 后者为了在计算最后一个非叶节点的右孩子时防止数组越界
        ArrayList<TreeNode> treeNodes = new ArrayList<>(n * 2);
        for (int i = 0; i < 2 * n + 2; i++) {
            treeNodes.add(null);
        }
        for (int i = 1; i <= n; i++) {
            var t = raw[i - 1];
            if (!t.equals("null")) {
                treeNodes.set(i, new TreeNode(Integer.parseInt(t)));
            }
        }

        for (int i = 1; i <= (int)Math.pow(2, (double)n / 2); i++) {
            if (treeNodes.get(i) == null) {
                treeNodes.add(2 * i, null);
                treeNodes.add(2 * i + 1, null);
            }
        }

        for (int i = 1; i <= treeNodes.size() / 2; i++) {
            var node = treeNodes.get(i);
            if (node == null) {
                continue;
            }

            node.left = treeNodes.get(2 * i);
            node.right = treeNodes.get(2 * i + 1);
        }

        return treeNodes.get(1);
    }
}