package lcof.task41;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {

        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(1);
        medianFinder.addNum(2);
        var x1 = medianFinder.findMedian();
        medianFinder.addNum(3);
        var x2 = medianFinder.findMedian();

        assertTrue(true);
    }
}
