package ru.job4j.calculator;

public class FakeCalculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        FakeCalculator.plus(one, two);
        FakeCalculator.div(six, two);
        FakeCalculator.minus(five, two);
        FakeCalculator.time(four, two);
        int age = 18;
        FakeCalculator.plus(age, 10);
        int size = 10;
        size = 100;
        FakeCalculator.minus(size, 5);
        one = 10;
        two = 11;
        FakeCalculator.plus(one, two);
        System.out.println(minusAndDivide(100, 200));
        System.out.println(sumOfFourOperations(300, 400));
    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void time(int first, int second) {
        int result = first * second;
        System.out.println(result);
    }

    public static double minusAndDivide(int first, int second) {
        return MathFunc.minus(first, second)
                + MathFunc.dev(first, second);
    }

    public static double sumOfFourOperations(int first, int second) {
        return MathFunc.dev(first, second)
                + MathFunc.dev(first)
                + MathFunc.multiply(first)
                + MathFunc.minus(first, second);
    }
}
