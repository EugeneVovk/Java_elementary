package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int expected = 0;
        int actual = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 10;
        int expected = -1;
        int actual = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int actual = FindLoop.indexInRange(data, el, start, finish);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 8;
        int start = 2;
        int finish = 4;
        int expected = -1;
        int actual = FindLoop.indexInRange(data, el, start, finish);
        Assert.assertEquals(expected, actual);
    }
}
