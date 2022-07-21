package ru.job4j.calculator;

public class MathFunc {
    public static void main(String[] args) {

        int result = MathFunc.multiply(3);
        int result2 = MathFunc.dev(5);
        int result3 = MathFunc.multiply(100);
        int total = result + result2;
        System.out.println(result3);
        System.out.println(total);
    }

    public static int multiply(int x) {
        return x * x + 1;
    }

    public static int dev(int x) {
        return 1 / x;
    }

    public static int minus(int first, int second) {
        return first - second;
    }

    public static double dev(int first, int second) {
        return (double) first / second;
    }
}
