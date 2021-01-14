package leetcode.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/string-to-integer-atoi/">link</a>
 */
public class Solution {

    enum State {
        START,
        SIGNED,
        IN_NUMBER,
        END
    }

    class Automation {
        public int sign = 1;
        public long ans = 0;
        private State state = State.START;
        private final Map<State, State[]> table = new HashMap<>() {{
            put(State.START, new State[] { State.START, State.SIGNED, State.IN_NUMBER, State.END });
            put(State.SIGNED, new State[]{ State.END, State.END, State.IN_NUMBER, State.END });
            put(State.IN_NUMBER, new State[]{ State.END, State.END, State.IN_NUMBER, State.END });
            put(State.END, new State[]{ State.END, State.END, State.END, State.END });
        }};

        public void get(char c) {
            state = table.get(state)[getCol(c)];
            if (state == State.IN_NUMBER) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, Integer.MAX_VALUE) : Math.min(ans, -(long)Integer.MIN_VALUE);
            }
            else if (state == State.SIGNED) {
                sign = c == '+' ? 1 : -1;
            }
        }

        private int getCol(char c) {
            if (c == ' ') {
                return 0;
            }
            if (c == '+' || c == '-') {
                return 1;
            }
            if (Character.isDigit(c)) {
                return 2;
            }
            return 3;
        }
    }

    public int myAtoi(String s) {
        Automation automation = new Automation();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            automation.get(s.charAt(i));
        }

        return (int)(automation.sign * automation.ans);
    }
}
