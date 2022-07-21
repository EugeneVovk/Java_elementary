package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP0K0Square0() {
        int p = 0;
        double k = 0;
        int expected = 0;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP10K10Square10() {
        int p = 10;
        double k = 10;
        double expected = 2.07;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }
}