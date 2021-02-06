package lcof.task7;

import leetcode.core.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/">link</a>
 */
public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null) {
            return null;
        }

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, 0, preorder.length);
    }

    private TreeNode build(int[] preorder, int pStart, int iStart, int length) {

        if (length == 0) {
            return null;
        }

        var node = new TreeNode(preorder[pStart]);
        if (length == 1) {
            return node;
        }

        int i = map.get(node.val) - iStart;

        node.left = build(preorder, pStart + 1, iStart, i);
        node.right = build(preorder, pStart + i + 1, iStart + i + 1, length - i - 1);

        return node;
    }
}
