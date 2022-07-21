package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {

    @Test
    public void whenA2B2C2Then1dot73() {
        double expected = 1.73;
        double actual = TrgArea.area(2, 2, 2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
