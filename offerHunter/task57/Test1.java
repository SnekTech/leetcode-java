package offerHunter.task57;

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
}
