package ru.job4j.array;

import java.util.Arrays;

/**
 * Реализовать метод таким образом,
 * чтобы значение ячеек с индексами source и dest поменялись местами.
 * При этом:
 * - source указывает на индекс элемента,
 * который будет записан в ячейку с индексом dest;
 * - dest указывает на индекс элемента,
 * который будет записан в ячейку с индексом source;
 */
public class SwitchArray {

    public static int[] swap(int[] array, int scr, int dst) {
        int tmp = array[scr];
        array[scr] = array[dst];
        array[dst] = tmp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
//        int[] rsl = swapBorder(nums);
//        for (int i : rsl) {
//            System.out.print(i + " ");
//        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(swap(nums, 0, nums.length - 1)));
    }
}
