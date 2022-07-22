package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointEqTest {
    @Test
    public void whenX1Y1X2Y2ThenTrue() {
        boolean action = PointEq.eq(1, 1, 2, 2);
        Assert.assertFalse(action);
    }
    @Test
    public void whenX10Y10X10Y10ThenTrue() {
        boolean action = PointEq.eq(10, 10, 10, 10);
        Assert.assertTrue(action);
    }
}
