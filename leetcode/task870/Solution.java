package leetcode.task870;

import java.util.LinkedList;
import java.util.TreeMap;

/**
 * @see https://leetcode-cn.com/problems/advantage-shuffle/
 */
public class Solution {

    private class Elem {
        public LinkedList<Integer> values = new LinkedList<>();
        public int elemCount = 1;
    }

    public int[] advantageCount(int[] A, int[] B) {
        int length = B.length;
        int[] result = new int[length];

        // A[i] -> count
        TreeMap<Integer, Integer> aMap = new TreeMap<>();
        // B[i] -> corresponding elements
        TreeMap<Integer, Elem> bMap = new TreeMap<>();
        for (int i = 0; i < length; i++) {
            if (aMap.containsKey(A[i])) {
                aMap.put(A[i], aMap.get(A[i]) + 1);
            }
            else {
                aMap.put(A[i], 1);
            }
            
            if (bMap.containsKey(B[i])) {
                bMap.get(B[i]).elemCount++;
            }
            else {
                bMap.put(B[i], new Elem());
            }
        }

        LinkedList<Integer> elementsRemaining = new LinkedList<>();

        for (var entry : bMap.entrySet()) {
            for (int i = 0; i < entry.getValue().elemCount; i++) {
                Integer ceiling = aMap.ceilingKey(entry.getKey() + 1);
                if (ceiling == null) {
                    // all keys in A are less than or equal to current bKey
                    // use the smallest element to compete against the current BIG key
                    // 田忌赛马？
                    if (aMap.firstEntry().getValue() == 1) {
                        elementsRemaining.add(aMap.pollFirstEntry().getKey());
                    }
                    else {
                        elementsRemaining.add(aMap.firstKey());
                        aMap.put(aMap.firstKey(), aMap.firstEntry().getValue() - 1);
                    }
                    continue;
                }

                entry.getValue().values.add(ceiling);
                if (aMap.get(ceiling) == 1) {
                    aMap.remove(ceiling);
                }
                else {
                    aMap.put(ceiling, aMap.get(ceiling) - 1);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            var values = bMap.get(B[i]).values;
            result[i] = values.size() == 0 ? elementsRemaining.removeLast() : values.removeLast();
        }

        return result;
    }
}
