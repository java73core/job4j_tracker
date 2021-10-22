package ru.job4j.oop;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out,  0.01);
    }

    @Test
    public void when52to10then6() {
        Point a = new Point(5, 2);
        Point b = new Point(-1, 0);
        double expected = 6.32;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to22to11then2() {
        Point a = new Point(4, -4, 1);
        Point b = new Point(2, -2, 1);
        double expected = 2.82;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to21to41then5() {
        Point a = new Point(3, -4, 4);
        Point b = new Point(2, -1, -1);
        double expected = 5.91;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}