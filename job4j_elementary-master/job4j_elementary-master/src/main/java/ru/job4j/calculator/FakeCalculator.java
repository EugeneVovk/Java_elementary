package ru.job4j.calculator;

public class FakeCalculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int age = 18;
        age = age + 10;
        int size = 10;
        size = 100;
        size -= five;
        int result = one + two;
        System.out.println(result);
        one = 10;
        two = 11;
        result = one + two;
        int[] array = {onePlusTwo, sixDivTwo, fiveMinusTwo, fourTimeTwo, age, size, result};

        for (int action : array) {
            System.out.println(action);
        }
    }
}
