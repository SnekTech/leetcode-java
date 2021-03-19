package lcof.task68_1;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/">link</a>
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (true) {
            if (p.val < ancestor.val && q.val < ancestor.val) {
                ancestor = ancestor.left;
            }
            else if (p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            }
            else {
                break;
            }
        }

        return ancestor;
    }
}