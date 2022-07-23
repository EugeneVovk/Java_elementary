package ru.job4j.array;

/**
 * Сортировка выборкой
 * Смысл этого метода в поиске минимального элемента из оставшихся
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int idx = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, idx);
        }
        return data;
    }
}
