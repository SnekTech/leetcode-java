package lcof.task7;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/">link</a>
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null) {
            return null;
        }

        return build(preorder, inorder, 0, 0, preorder.length);
    }

    private TreeNode build(int[] preorder, int[] inorder, int pStart, int iStart, int length) {

        if (length == 0) {
            return null;
        }

        var node = new TreeNode(preorder[pStart]);
        if (length == 1) {
            return node;
        }

        int i;
        for (i = 0; i < length; i++) {
            if (inorder[iStart + i] == node.val) {
                break;
            }
        }

        node.left = build(preorder, inorder, pStart + 1, iStart, i);
        node.right = build(preorder, inorder, pStart + i + 1, iStart + i + 1, length - i - 1);

        return node;
    }
}
