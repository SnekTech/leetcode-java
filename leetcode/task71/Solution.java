package leetcode.task71;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/simplify-path/">link</a>
 */
public class Solution {

    enum State {
        Start,
        Dir,
        Slashing,
        OneDot,
        TwoDot
    }

    public String simplifyPath(String path) {
        State state = State.Start;
        Stack<String> stack = new Stack<>();
        StringBuilder dirName = new StringBuilder();

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);

            if (state == State.Start) {
                if (ch == '/') {
                    state = State.Slashing;
                }
                else if (ch == '.') {
                    state = State.OneDot;
                }
                else {
                    state = State.Dir;
                }
                continue;
            }

            if (state == State.Slashing) {
                if (ch == '/') {
                    continue;
                }

                if (ch == '.') {
                    state = State.OneDot;
                }
                else {
                    state = State.Dir;
                    dirName.append('/').append(ch);
                    if (i == path.length() - 1) {
                        stack.push(dirName.toString());
                        dirName.delete(0, dirName.length());
                        break;
                    }
                }
                continue;
            }

            if (state == State.OneDot) {
                if (ch == '/') {
                    state = State.Slashing;
                    continue;
                }
                else if (ch == '.') {
                    if (i == path.length() - 1) {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                        break;
                    }

                    state = State.TwoDot;
                    continue;
                }
                else {
                    state = State.Dir;
                    dirName.append("/.").append(ch);
                    if (i == path.length() - 1) {
                        stack.push(dirName.toString());
                        dirName.delete(0, dirName.length());
                        break;
                    }
                    continue;
                }
            }

            if (state == State.TwoDot) {
                if (ch == '/') {
                    state = State.Slashing;
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                else {
                    state = State.Dir;
                    dirName.append("/..").append(ch);
                    if (i == path.length() - 1) {
                        stack.push(dirName.toString());
                        dirName.delete(0, dirName.length());
                        break;
                    }
                }
                continue;
            }

            // state == State.Dir
            if (ch == '/') {

                state = State.Slashing;
                stack.push(dirName.toString());
                dirName.delete(0, dirName.length());
            }
            else {
                dirName.append(ch);
                if (i == path.length() - 1) {
                    stack.push(dirName.toString());
                    dirName.delete(0, dirName.length());
                    break;
                }
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        dirName.delete(0, dirName.length());
        while (!stack.isEmpty()) {
            dirName.insert(0, stack.pop());
        }

        return dirName.toString();
    }
}
