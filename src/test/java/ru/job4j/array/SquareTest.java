package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void whenBoundIs5() {
        int[] expected = {0, 1, 4, 9, 16};
        int[] actual = Square.calculate(5);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenBoundIs0() {
        int[] expected = {};
        int[] actual = Square.calculate(0);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenBoundIsMinus1() {
        try {
            int[] actual = Square.calculate(-1);
            Assert.fail("should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }
    }
}
