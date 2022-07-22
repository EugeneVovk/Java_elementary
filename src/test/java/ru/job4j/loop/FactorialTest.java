package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void when5Then120() {
        int expected = 120;
        int actual = Factorial.calc(5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void when0Then1() {
        int expected = 1;
        int actual = Factorial.calc(0);
        Assert.assertEquals(expected, actual);
    }
}
