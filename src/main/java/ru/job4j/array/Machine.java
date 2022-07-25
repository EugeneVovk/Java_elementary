package ru.job4j.array;

import java.util.Arrays;

/**
 * Реализовать механизм возврата монет в вендинговых аппаратах
 * <p>
 * У вас есть купюра 50, 100 рублей. Вы хотите купить кофе за 35 рублей.
 * Если вы засунули 50 рублей, то автомат должен вернуть 15 рублей (монетами 10 и 5).
 * При этом метод должен вернуть результат в виде массива значений типа int,
 * т.е. для описанной ситуации в результате мы получим массив из двух чисел - {10, 5}.
 * И монеты будут располагаться от максимального к минимальному номиналу.
 * Автомат может вернуть только монеты.
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                rsl[size++] = coin;
                money -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
