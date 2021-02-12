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
        backTrack(root, 0, sum);
        return result;
    }

    private void backTrack(TreeNode node, int sum, int max) {
        if (node == null) {
            return;
        }
        current.add(node.val);
        sum += node.val;

        if (sum == max && node.left == null && node.right == null) {
            result.add(new ArrayList<>(current));
        }

        backTrack(node.left, sum, max);
        backTrack(node.right, sum, max);
        current.remove(current.size() - 1);
    }
}