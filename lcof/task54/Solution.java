package lcof.task54;

import leetcode.core.TreeNode;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/">link</a>
 */
class Solution {
    int count = 0;
    int answer = 0;
    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;

        dfs(root);

        return answer;
    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.right);
        count++;
        if (count == k) {
            answer = root.val;
        }
        dfs(root.left);
    }
}