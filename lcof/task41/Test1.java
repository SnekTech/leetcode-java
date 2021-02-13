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

    @Test
    public void wrong1() {

        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(6);
        medianFinder.addNum(10);
        var x1 = medianFinder.findMedian();
        medianFinder.addNum(2);
        var x2 = medianFinder.findMedian();

        assertTrue(true);
    }

    @Test
    public void wrong2() {

        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(-1);
        var x1 = medianFinder.findMedian();
        medianFinder.addNum(-2);
        var x2 = medianFinder.findMedian();
        medianFinder.addNum(-3);
        var x3 = medianFinder.findMedian();
        medianFinder.addNum(-4);
        var x4 = medianFinder.findMedian();
        medianFinder.addNum(-5);
        var x5 = medianFinder.findMedian();

        assertTrue(true);
    }
}
