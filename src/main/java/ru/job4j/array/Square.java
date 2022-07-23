package ru.job4j.array;

/**
 * создать программу, которая будет заполнять массив числами,
 * возведенными в квадрат.
 */
public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(-1);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
