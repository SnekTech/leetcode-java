package leetcode.task95;

import leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/unique-binary-search-trees-ii/">link</a>
 */
public class Solution {

    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }

    List<TreeNode> generate(int min, int max) {
        List<TreeNode> trees = new ArrayList<>();

        if (min > max) {
            trees.add(null);
            return trees;
        }

        for (int i = min; i <= max; i++) {
            var leftChildren = generate(min, i - 1);
            var rightChildren = generate(i + 1, max);

            for (var leftChild : leftChildren) {
                for (var rightChild : rightChildren) {
                    trees.add(new TreeNode(i, leftChild, rightChild));
                }
            }
        }

        return trees;
    }
}
