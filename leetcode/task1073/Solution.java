package leetcode.task1073;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/adding-two-negabinary-numbers/">link</a>
 */
public class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        /*
        (-2)^n + (-2)^n = (-2)^(n + 1) + (-2)^(n + 2)
        第 n 位进若进位，则 n+1 和 n+2 位都要进位
         */

        int length1 = arr1.length;
        int length2 = arr2.length;
        int resultLength = Math.max(length1, length2) + 4;

        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = 0;
        }

        for (int i = length1 - 1; i >= 0; i--) {
            result[length1 - 1 - i] += arr1[i];
        }

        for (int i = length2 - 1; i >= 0; i--) {
            result[length2 - 1 - i] += arr2[i];
        }

        for (int i = 0; i < resultLength - 2; i++) {
            int carry = result[i] >> 1;
            result[i] &= 1;
            result[i + 1] += carry;
            result[i + 2] += carry;
        }

        int k = resultLength - 3;
        while (k > 0 && result[k] == 0) k--;
        // get [0 ... k] from result array
        result = Arrays.copyOf(result, k + 1);
        int[] toReturn = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            toReturn[i] = result[k - i];
        }

        return toReturn;
    }
}
