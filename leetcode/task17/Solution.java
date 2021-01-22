package leetcode.task17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/">link</a>
 */
public class Solution {
    Map<Character, String> table = new HashMap<>();
    StringBuilder seq = new StringBuilder();
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        table.put('2', "abc");
        table.put('3', "def");
        table.put('4', "ghi");
        table.put('5', "jkl");
        table.put('6', "mno");
        table.put('7', "pqrs");
        table.put('8', "tuv");
        table.put('9', "wxyz");

        if (digits.isEmpty()) {
            return result;
        }

        backTrack(digits, 0);

        return result;
    }

    private void backTrack(String digits, int index) {
        if (index == digits.length()) {
            result.add(seq.toString());
            return;
        }

        String chars = table.get(digits.charAt(index));
        for (int i = 0; i < chars.length(); i++) {
            seq.append(chars.charAt(i));
            backTrack(digits, index + 1);
            seq.deleteCharAt(seq.length() - 1);
        }
    }
}
