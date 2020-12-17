package leetcode.task504;

import java.util.Stack;

/**
 * @see https://leetcode-cn.com/problems/base-7/
 */
public class Solution {
    public String convertToBase7(int num) {
        
        StringBuilder stringBuilder = new StringBuilder();
        if (num < 0) {
            stringBuilder.append("-");
            num = -num;
        }
        int quatient, remainder;
        int base = 7;
        Stack<Integer> stack = new Stack<>();
        while (true) {
            quatient = num / base;
            remainder = num % base;
            stack.push(remainder);
            if (quatient == 0)
                break;
            num = quatient;
        }

        
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
}
