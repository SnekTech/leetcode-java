package lcof.task58_1;

import java.util.ArrayList;

/**
 * @see <a href="https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/">link</a>
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> line = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (builder.length() > 0) {
                    line.add(builder.toString());
                    builder.delete(0, builder.length());
                }
            }
            else {
                builder.append(s.charAt(i));
            }
        }

        if (builder.length() > 0) {
            line.add(builder.toString());
            builder.delete(0, builder.length());
        }

        for (int i = line.size() - 1; i >= 0; i--) {
            if (i < line.size() - 1) {
                builder.append(' ');
            }
            builder.append(line.get(i));
        }

        return builder.toString();
    }
}