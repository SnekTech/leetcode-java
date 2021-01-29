package leetcode.task71;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String path = "/home/";

        Solution solution = new Solution();
        String expected = "/home";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String path = "/../";

        Solution solution = new Solution();
        String expected = "/";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String path = "/home//foo/";

        Solution solution = new Solution();
        String expected = "/home/foo";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        String path = "/a/./b/../../c/";

        Solution solution = new Solution();
        String expected = "/c";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        String path = "/a/../../b/../c//.//";

        Solution solution = new Solution();
        String expected = "/c";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void example6() {
        String path = "/a//b////c/d//././/..";

        Solution solution = new Solution();
        String expected = "/a/b/c";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }
}
