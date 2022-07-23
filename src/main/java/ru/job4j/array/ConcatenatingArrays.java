package ru.job4j.array;

/**
 * Идея состоит в том, чтобы создать массив,
 * длина которого равна сумме двух массивов для объединения.
 * После этого мы должны добавить элементы первого,
 * а затем элементы второго.
 * Мы можем использовать метод Arrays.setAll,
 * чтобы избежать написания цикла
 * Arrays.setAll(rslArray, i ->
 * (i < array1.length ? array1[i] : array2[i - array1.length]));
 * Третий вариант объединения с массивами: System.arraycopy:
 * System.arraycopy(anArray, 0, resultArray, 0, anArray.length);
 * System.arraycopy(anotherArray, 0, resultArray, anArray.length, anotherArray.length);
 * Как мы можем видеть, мы копируем первый массив,
 * затем второй (после последнего элемента первого).
 */
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
