package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void when1IsMonday() {
        int expected = 1;
        int actual = MultipleSwitchWeek.numberOfDay("Понедельник");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when7IsSunday() {
        int expected = 7;
        int actual = MultipleSwitchWeek.numberOfDay("Sunday");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when0IsError() {
        int expected = -1;
        int actual = MultipleSwitchWeek.numberOfDay("Ошибка");
        Assert.assertEquals(expected, actual);
    }
}
