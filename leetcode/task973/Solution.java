package leetcode.task973;

import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/k-closest-points-to-origin/">link</a>
 */
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer[]> queue = new PriorityQueue<>(
                (a, b) -> getDistance(b[0], b[1]) - getDistance(a[0], a[1])
        );
        int[][] result = new int[k][2];

        int n = points.length;
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            if (i < k) {
                queue.add(new Integer[] {x, y});
            }
            else {
                assert queue.peek() != null;
                int minX = queue.peek()[0], minY = queue.peek()[1];
                if (getDistance(x, y) < getDistance(minX, minY)) {
                    queue.poll();
                    queue.add(new Integer[] {x, y});
                }
            }
        }

        for (int i = 0; !queue.isEmpty(); i++) {
            var point = queue.poll();
            result[i][0] = point[0];
            result[i][1] = point[1];
        }

        return result;
    }

    private static int getDistance(int x, int y) {
        return x * x + y * y;
    }
}