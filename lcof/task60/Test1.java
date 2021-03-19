package lcof.task60;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 1;

        Solution solution = new Solution();
        double[] expected = new double[] {0.16667,0.16667,0.16667,0.16667,0.16667,0.16667};
        double[] actual = solution.dicesProbability(n);
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void example2() {
        int n = 2;

        Solution solution = new Solution();
        double[] expected = new double[] {0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778};
        double[] actual = solution.dicesProbability(n);
        assertArrayEquals(expected, actual, 0.001);
    }
}
