package leetcode.task1552;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/magnetic-force-between-two-balls/">link</a>
 */
class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int left = 1, right = position[position.length - 1] - position[0], ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(mid, position, m)) {
                ans = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    boolean check(int x, int[] position, int m) {
        int pre = position[0], count = 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - pre >= x) {
                count++;
                pre = position[i];
            }
        }

        return count >= m;
    }
}