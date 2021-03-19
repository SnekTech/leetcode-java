package lcof.task50;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/">link</a>
 */
class Solution {
    static class Pair {
        char ch;
        int pos;

        public Pair(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }

    public char firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
                queue.add(new Pair(c, i));
            }
            else {
                map.put(c, -1);
                while (!queue.isEmpty() && map.get(queue.peek().ch) == -1) {
                    queue.remove();
                }
            }
        }

        return queue.isEmpty() ? ' ' : queue.peek().ch;
    }
}