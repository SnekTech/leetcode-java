package leetcode.task208;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/implement-trie-prefix-tree/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Trie {
    Trie[] children = new Trie[26];
    boolean isWordEnd = false;

    /** Initialize your data structure here. */
    public Trie() {
        Arrays.fill(children, null);
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Trie t = this;
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - 'a';
            if (t.children[childIndex] == null) {
                t.children[childIndex] = new Trie();
            }
            t = t.children[childIndex];
        }
        if (t != this) {
            t.isWordEnd = true;
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie t = this;
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - 'a';
            if (t.children[childIndex] == null) {
                return false;
            }
            t = t.children[childIndex];
        }

        return t.isWordEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie t = this;
        for (int i = 0; i < prefix.length(); i++) {
            int childIndex = prefix.charAt(i) - 'a';
            if (t.children[childIndex] == null) {
                return false;
            }
            t = t.children[childIndex];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean r1 = obj.search("apple");
        boolean r2 = obj.startsWith("app");
        boolean r3 = obj.search("appl");
    }
}
