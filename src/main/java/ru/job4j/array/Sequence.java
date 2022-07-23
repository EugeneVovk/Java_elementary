package ru.job4j.array;

/**
 * Двухмерный массив. Циклы
 */
public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int el = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = el++;
            }
        }
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
