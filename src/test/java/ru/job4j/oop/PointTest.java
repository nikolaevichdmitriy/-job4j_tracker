package ru.job4j.oop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then4() {
        double expected = 4;
        double out = Math.pow(new Point(0, 0).distance(new Point(2, 0)), 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then9() {
        double expected = 9;
        double out = Math.pow(new Point(5, 0).distance(new Point(2, 0)), 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then104Dot0() {
        double expected = 104.0;
        double out = Math.pow(new Point(5, 0).distance(new Point(7, 10)), 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then18() {
        double expected = 18;
        double out = Math.pow(new Point(5, 3).distance(new Point(2, 0)), 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to00to00then1() {
        int expected = 1;
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}