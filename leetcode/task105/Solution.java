package leetcode.task105;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">link</a>
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            throw new IllegalArgumentException();
        }

        int n1 = preorder.length, n2 = inorder.length;
        if (n1 != n2) {
            throw new IllegalArgumentException();
        }

        return build(preorder, inorder, 0, n1 -1, 0, n1 - 1);
    }

    TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        assert rootIndex != -1;
        int leftLength = rootIndex - inStart;
        int rightLenth = inEnd - rootIndex;

        root.left = build(preorder, inorder, preStart + 1, preStart + 1 + leftLength - 1, inStart, rootIndex - 1);
        root.right = build(preorder, inorder, preEnd - rightLenth + 1, preEnd, rootIndex + 1, inEnd);
        return root;
    }
}