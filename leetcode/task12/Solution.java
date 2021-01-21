package leetcode.task12;

public class Solution {
    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();

        int thousands = num / 1000;
        sb.append("M".repeat(thousands));
        num %= 1000;

        int hundreds = num / 100;
        if (hundreds == 9)  {
            sb.append("CM");
        }
        else if (hundreds >= 5) {
            sb.append("D").append("C".repeat(hundreds - 5));
        }
        else if (hundreds == 4) {
            sb.append("CD");
        }
        else {
            sb.append("C".repeat(hundreds));
        }
        num %= 100;

        int tens = num / 10;
        if (tens == 9)  {
            sb.append("XC");
        }
        else if (tens >= 5) {
            sb.append("L").append("X".repeat(tens - 5));
        }
        else if (tens == 4) {
            sb.append("XL");
        }
        else {
            sb.append("X".repeat(tens));
        }
        num %= 10;

        if (num == 9) {
            sb.append("IX");
        }
        else if (num >= 5) {
            sb.append("V").append("I".repeat(num - 5));
        }
        else if (num == 4) {
            sb.append("IV");
        }
        else {
            sb.append("I".repeat(num));
        }

        return sb.toString();
    }
}
