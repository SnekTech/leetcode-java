package lcof.task57_2;

import java.util.ArrayList;

/**
 * @see <a href="https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/">link</a>
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1; i <= target / 2; i++) {
            for (int j = i + 1; j < target; j++) {
                int counts = j - i + 1;
                int sum = ( i + j ) * counts / 2;
                if (sum == target) {
                    int[] seq = new int[counts];
                    for (int n = i; n <= j; n++) {
                        seq[n - i] = n;
                    }
                    list.add(seq);
                } else if (sum > target) {
                    break;
                }
            }
        }

        int[][] result;
        if (list.size() == 0) {
            result = new int[][] {};
        } else {
            result = new int[list.size()][];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }
        }
        
        return result;
    }
}
