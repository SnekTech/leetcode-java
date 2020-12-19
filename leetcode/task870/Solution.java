package leetcode.task870;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * @see https://leetcode-cn.com/problems/advantage-shuffle/
 */
public class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int length = B.length;
        int[] result = new int[length];

        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        Map<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            treeMap.put(B[i], new ArrayList<>());
            positionMap.put(B[i], i);
        }

        List<Integer> numsRemaining = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            List<Integer> nums = treeMap.floorEntry(A[i]).getValue();
            if (nums == null) {
                // all keys are greater than A[i]
                numsRemaining.add(A[i]);
                continue;
            }

            // the greatest key less than A[i], efficient purpose
            nums.add(A[i]);
        }

        

        return result;
    }
}
