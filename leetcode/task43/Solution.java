package leetcode.task43;

/**
 * @see <a href="https://leetcode-cn.com/problems/multiply-strings/">link</a>
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String ans = "0";
        int m = num1.length(), n = num2.length();
        for (int i = n - 1; i >= 0; i--) {
            StringBuilder curr = new StringBuilder();
            int carry = 0;
            curr.append("0".repeat(Math.max(0, n - 1 - i)));
            int y = num2.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int x = num1.charAt(j) - '0';
                int product = x * y + carry;
                curr.append(product % 10);
                carry = product / 10;
            }
            if (carry != 0) {
                curr.append(carry % 10);
            }
            ans = addString(ans, curr.reverse().toString());
        }

        return ans;
    }

    public String addString(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + carry;
            ans.append(result % 10);
            carry = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
}
