package ru.job4j.array;

/**
 * Метод должен проверить, что все элементы в массиве
 * являются либо true либо false
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
