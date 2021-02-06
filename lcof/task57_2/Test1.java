package lcof.task57_2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int target = 9;
        int[][] expecteds = {
            { 2, 3, 4 },
            { 4, 5 }
        };

        int[][] actuals = new Solution().findContinuousSequence(target);

        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void example2() {
        int target = 15;
        int[][] expecteds = {
            { 1, 2, 3, 4, 5 },
            { 4, 5, 6 },
            { 7, 8 }
        };

        int[][] actuals = new Solution().findContinuousSequence(target);

        assertArrayEquals(expecteds, actuals);
    }

    // @Test
    // public void wrong1() {
    //     int target = 32;
    //     int[][] expecteds = {
    //         { 1, 2, 3, 4, 5 },
    //         { 4, 5, 6 },
    //         { 7, 8 }
    //     }; // not the actual expecteds

    //     int[][] actuals = new Solution().findContinuousSequence(target);

    //     assertArrayEquals(expecteds, actuals);
    // }
}
