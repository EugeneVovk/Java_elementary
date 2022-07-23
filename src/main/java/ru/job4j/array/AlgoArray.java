package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
