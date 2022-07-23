package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] expected = new int[] {1, 2, 3, 4, 5};
        int[] actual = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {3, 4, 1};
        int[] expected = new int[] {1, 3, 4};
        int[] actual = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void whenSortArrayNotElements() {
        int[] data = new int[] {};
        int[] expected = new int[] {};
        int[] actual = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, actual);
    }
}