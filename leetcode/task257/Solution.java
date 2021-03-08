package leetcode.task257;

import leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-paths/">link</a>
 */
class Solution {
    List<String> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return result;
        }

        current.add(root.val);
        backTrack(root);

        return result;
    }

    void backTrack(TreeNode root) {
        if (root.left == null && root.right == null) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < current.size(); i++) {
                if (i > 0) {
                    builder.append("->");
                }
                builder.append(current.get(i));
            }
            result.add(builder.toString());
            return;
        }

        if (root.left != null) {
            current.add(root.left.val);
            backTrack(root.left);
            current.remove(current.size() - 1);
        }

        if (root.right != null) {
            current.add(root.right.val);
            backTrack(root.right);
            current.remove(current.size() - 1);
        }
    }
}