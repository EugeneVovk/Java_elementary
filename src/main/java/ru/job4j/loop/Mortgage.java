package ru.job4j.loop;

/**
 * В этом задании нужно посчитать количество лет,
 * необходимых для погашения кредита.
 * Кредитная сумма пересчитывается каждый год от остатка суммы,
 * умноженной на процент.
 * Например, вы взяли кредит на 100 рублей.
 * За год вы зарабатываете 70 рублей.
 * Вам дали кредит на 50% в год.
 * В конце года Ваш долг составит 150 рублей.
 * 100 рублей (начальный долг) + 100 рублей * 0.5 (процент) = 150 рублей.
 * За год вы заработали 70 рублей. Ими вы можете погасить часть кредита.
 * 150 - 70 = 80 рублей (долг).
 * Дальше считаем новый год: 80 * 0.5 = 40 рублей.
 * Плюс добавляем остаток 80 рублей за тот год.
 * Нам нужно заплатить 120 рублей.
 * Минус 70 рублей остается 50 рублей.
 * 0.5 - это 50%.
 * Считаем снова новый год. 50 * 0.5 = 25 рублей + 50 = 75 рублей.
 * Минус доход 70 рублей. Остается 5 рублей.
 * Считаем снова.  5 * 0.5 = 2.5 + 5 = 7.5 рублей.
 * Минус доход 70 рублей. Мы погасили кредит.
 * В итоге получается: 4 года.
 * В этом задании нужно использовать цикл while.
 */
public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
