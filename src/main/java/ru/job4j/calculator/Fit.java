package ru.job4j.calculator;

/**
 * В этом задании нужно написать программу для вычисления идеального веса.
 * Ниже приведены формулы для вычисления идеального веса.
 * Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
 * Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */
public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
