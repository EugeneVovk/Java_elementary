package ru.job4j.loop;

/**
 * В цикле while заранее неизвестно количество повторений.
 * Давайте рассмотрим ситуацию, когда мы вычисляем ежемесячный доход.
 */
public class Income {
    public static void main(String[] args) {
        int income = 0;
        while (income < 100) {
            System.out.println(income);
            income += 10;
        }
    }
}
