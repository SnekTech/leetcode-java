package lcof.task33;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/">link</a>
 */
class Solution {
    public boolean verifyPostorder(int[] postorder) {

        return verify(postorder, 0, postorder.length - 1);
    }

    // [start ... end]
    public boolean verify(int[] postorder, int start, int end) {
        if (end - start <= 1) {
            return true;
        }

        int left = start - 1, right = end, rootVal = postorder[end];
        while (left + 1 < end && postorder[left + 1] < rootVal) {
            left++;
        }
        while (right > start && postorder[right - 1] > rootVal) {
            right--;
        }

        if (right != left + 1) {
            return false;
        }

        if (left == start - 1 || right == end) {
            return verify(postorder, start, end - 1);
        }
        else {
            return verify(postorder, start, left) && verify(postorder, right, end - 1);
        }
    }
}