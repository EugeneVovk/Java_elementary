package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] dest = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            dest[i] = array[array.length - 1 - i];
        }
        return dest;
    }
}
