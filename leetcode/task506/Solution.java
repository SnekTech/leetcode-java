package leetcode.task506;

import java.util.TreeMap;

/**
 * @see https://leetcode-cn.com/problems/relative-ranks/
 */
public class Solution {
    public static final String GOLD = "Gold Medal";
    public static final String SILVER = "Silver Medal";
    public static final String BRONZE = "Bronze Medal";
    
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        TreeMap<Integer, Integer> treeMap = new TreeMap<>((a, b) -> -a.compareTo(b));
        for (int i = 0; i < nums.length; i++) {
            treeMap.put(nums[i], i);
        }

        int i = 1;

        while (!treeMap.isEmpty()) {
            var firstEntry = treeMap.pollFirstEntry();
            String title;
            if (i == 1) {
                title = GOLD;
            }
            else if (i == 2) {
                title = SILVER;
            }
            else if (i == 3) {
                title = BRONZE;
            }
            else {
                title = String.valueOf(i);
            }
            result[firstEntry.getValue()] = title;
            i++;
        }

        return result;
    }
}
