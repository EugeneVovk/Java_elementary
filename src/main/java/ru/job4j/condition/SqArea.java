package ru.job4j.condition;

/**
 * Вычислить площадь прямоугольника
 * Известны периметр и соотношение сторон прямоугольника
 */
public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }
}
