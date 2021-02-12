package lcof.task36;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/">link</a>
 */
class Solution {
    static class Pair {
        Node min;
        Node max;
    }

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }

        var pair = dfs(root);
        var min = pair.min;
        var max = pair.max;
        min.left = max;
        max.right = min;

        return min;
    }

    private Pair dfs(Node node) {
        if (node == null) {
            return null;
        }

        var pair = new Pair();

        var leftPair = dfs(node.left);
        pair.min = leftPair == null ? node : leftPair.min;

        if (leftPair != null) {
            var prev = leftPair.max;
            prev.right = node;
            node.left = prev;
        }

        var rightPair = dfs(node.right);
        pair.max = rightPair == null ? node : rightPair.max;

        if (rightPair != null) {
            var next = rightPair.min;
            next.left = node;
            node.right = next;
        }

        return pair;
    }
}