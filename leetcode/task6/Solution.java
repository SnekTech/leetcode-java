package leetcode.task6;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/zigzag-conversion/">link</a>
 */
public class Solution {

    class Unit {
        public List<Character> first = new ArrayList<>();
        public List<Character> second = new ArrayList<>();
    }

    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        if (s.length() == 1 || numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int unitSize = numRows * 2 - 2;

        List<Unit> units = new ArrayList<>();

        int i;
        for (i = 0; i + unitSize - 1 < s.length(); i += unitSize) {
            var unit = new Unit();
            for (int j = i; j < i + unitSize; j++) {
                if (j - i < unitSize / 2) {
                    unit.first.add(s.charAt(j));
                }
                else {
                    unit.second.add(s.charAt(j));
                }
            }
            units.add(unit);
        }

        if (i != s.length()) {
            var lastUnit = new Unit();
            for (int j = i; j < i + unitSize; j++) {
                char toAdd = j < s.length() ? s.charAt(j) : 0;
                if (j - i < unitSize / 2) {
                    lastUnit.first.add(toAdd);
                }
                else {
                    lastUnit.second.add(toAdd);
                }
            }
            units.add(lastUnit);
        }

        StringBuilder sb = new StringBuilder();
        for (var unit : units) {
            sb.append(unit.first.remove(0));
        }

        while (!units.get(0).first.isEmpty() || !units.get(0).second.isEmpty()) {
            for (var unit : units) {
                if (!unit.first.isEmpty()) {
                    char toRemove = unit.first.remove(0);
                    if (toRemove != 0) {
                        sb.append(toRemove);
                    }
                }
                if (!unit.second.isEmpty()) {
                    char toRemove = unit.second.remove(unit.second.size() - 1);
                    if (toRemove != 0) {
                        sb.append(toRemove);
                    }
                }
            }
        }

        return sb.toString();
    }
}
