package ru.job4j.array;

public class ConcatenatingArrays {
    public static void main(String[] args) {

        int[] array1 = {5, 2, 1, 4, 8};
        int[] array2 = {10, 4, 9, 11, 2};
        int[] rslArray = new int[array1.length + array2.length];

        for (int i = 0; i < rslArray.length; i++) {
            rslArray[i] = (i < array1.length ? array1[i] : array2[i - array1.length]);
        }
        for (int el : rslArray) {
            System.out.print(el + " ");
        }
    }
}
