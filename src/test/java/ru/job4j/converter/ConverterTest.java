package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float actual = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void whenConvert120RblThen2Dollars() {
        float in = 120;
        float expected = 2;
        float actual = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void whenConvert140RblThen2dot333Dollars() {
        float in = 140;
        float expected = 2.333f;
        float actual = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, actual, 0.001f);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float actual = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, actual, eps);
    }
}