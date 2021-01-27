package leetcode.task57;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/insert-interval/">link</a>
 */
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0], right = newInterval[1];
        boolean placed = false;
        List<int[]> result = new ArrayList<>();
        for (var interval : intervals) {
            if (interval[0] > right) {
                if (!placed) {
                    result.add(new int[] { left, right });
                    placed = true;
                }
                result.add(interval);
            }
            else if (interval[1] < left) {
                result.add(interval);
            }
            else {
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }

        if (!placed) {
            result.add(new int[] { left, right });
        }

        return result.toArray(new int[result.size()][2]);
    }
}
