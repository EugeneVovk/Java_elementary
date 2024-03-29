package ru.job4j.condition;

/**
 * Написать формулу вычисления площади треугольника.
 * Площадь треугольника вычисляется по формуле Герона.
 * где a, b и с - это длины сторон, а P - это полупериметр.
 * Полупериметр вычисляется как сумма всех сторон, деленная на 2.
 */
public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
