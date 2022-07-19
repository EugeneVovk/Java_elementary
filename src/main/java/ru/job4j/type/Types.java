package ru.job4j.type;

public class Types {
    public static void main(String[] args) {
        byte b = 100;
        short s = b;
        int i = s;
        long l = i;
        System.out.println("Вывод в консоль значения после расширения: " + l);

        int intNum = 2_147_483_600;
        float f = intNum;
        System.out.println(f);

        int intNum2 = 10000;
        byte byteNum = (byte) intNum2;
        short shortNum = (short) intNum2;
        double d = 94.984751;
        int intNum3 = (int) d;

        System.out.println("Вывод в консоль значения после преобразования: " + byteNum);
        System.out.println("Вывод в консоль значения после преобразования: " + shortNum);
        System.out.println("Вывод в консоль значения после преобразования: " + intNum3);

        int intNum4 = 100;
        char c = (char) intNum4;
        System.out.println("Вывод в консоль значения после преобразования: " + c);
    }
}
