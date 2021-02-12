package lcof.task34;

import leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/">link</a>
 */
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }
        current.add(root.val);
        backTrack(root, root.val, sum);
        return result;
    }

    private void backTrack(TreeNode node, int sum, int max) {
        if (sum == max && node.left == null && node.right == null) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (node.left != null) {
            current.add(node.left.val);
            backTrack(node.left, sum + node.left.val, max);
            current.remove(current.size() - 1);
        }
        if (node.right != null) {
            current.add(node.right.val);
            backTrack(node.right, sum + node.right.val, max);
            current.remove(current.size() - 1);
        }
    }
}