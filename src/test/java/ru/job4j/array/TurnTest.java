package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] expected = new int[]{2, 6, 1, 4};
        int[] actual = Turn.back(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2, 18};
        int[] expected = new int[]{18, 2, 6, 1, 4};
        int[] actual = Turn.back(input);
        Assert.assertArrayEquals(expected, actual);
    }
}
