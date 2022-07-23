package ru.job4j.array;

import java.util.Arrays;

/**
 * Дается массив, все элементы в котором
 * нужно переставить в обратном порядке
 */
public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(Turn.back(array)));
    }
}
