package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when1IsMonday() {
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when7IsSunday() {
        String expected = "Воскресенье";
        String actual = SwitchWeek.nameOfDay(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when0IsError() {
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenMinus1IsError() {
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(-1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when8IsError() {
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(8);
        Assert.assertEquals(expected, actual);
    }
}
