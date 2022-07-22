package ru.job4j.condition;

/**
 * Метод eq проверяет, что две точки в системе координат одинаковы.
 */
public class PointEq {

    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }
}
