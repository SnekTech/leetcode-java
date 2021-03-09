package leetcode.task139;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        Solution solution = new Solution();
        boolean actual = solution.wordBreak(s, wordDict);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");

        Solution solution = new Solution();
        boolean actual = solution.wordBreak(s, wordDict);
        assertTrue(actual);
    }

    @Test
    public void example3() {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");

        Solution solution = new Solution();
        boolean actual = solution.wordBreak(s, wordDict);
        assertFalse(actual);
    }
}
