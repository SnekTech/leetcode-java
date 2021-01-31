package leetcode.task89;

import java.util.*;

/**
 * @see <a href="https://leetcode-cn.com/problems/gray-code/">link</a>
 */
public class Solution {
    List<Integer> result = new ArrayList<>();
    Set<Integer> gray = new HashSet<>();
    int maxLength;
    int n;
    public List<Integer> grayCode(int n) {
        result.add(0);
        gray.add(0);
        if (n == 0) {
            return result;
        }
        this.n = n;
        maxLength = (int)Math.pow(2, n);

        backTrack();

        return result;
    }

    boolean backTrack() {
        if (gray.size() == maxLength) {
            return true;
        }

        int current = result.get(result.size() - 1);
        for (int i = 0; i < n; i++) {
            int next = current;
            next ^= (1 << i);
            if (gray.contains(next)) {
                continue;
            }
            result.add(next);
            gray.add(next);
            if (backTrack()) {
                return true;
            }
            result.remove(result.size() - 1);
            gray.remove(next);
        }

        return false;
    }
}
