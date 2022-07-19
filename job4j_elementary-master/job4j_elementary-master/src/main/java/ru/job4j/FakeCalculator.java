package ru.job4j;

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
        int[] array = {onePlusTwo, sixDivTwo, fiveMinusTwo, fourTimeTwo};

        for (int action : array) {
            System.out.println(action);
        }
    }
}
