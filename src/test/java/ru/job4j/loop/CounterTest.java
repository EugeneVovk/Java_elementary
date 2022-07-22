package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenStart0Finish10Then55() {
        int expected = 55;
        int actual = Counter.sum(0, 10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenStart3Finish8Then33() {
        int expected = 33;
        int actual = Counter.sum(3, 8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenStart1Finish1Then1() {
        int expected = 1;
        int actual = Counter.sum(1, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenStart0Finish10Then30() {
        int expected = 30;
        int actual = Counter.sumByEven(0, 10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenStart3Finish8Then() {
        int expected = 18;
        int actual = Counter.sumByEven(3, 8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenStart1Finish1Then() {
        int expected = 0;
        int actual = Counter.sumByEven(1, 1);
        Assert.assertEquals(expected, actual);
    }
}
