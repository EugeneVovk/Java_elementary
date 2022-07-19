package ru.job4j.calculator;

/**
 * Внутри метода main выполните следующие действия
 * (каждое действие должно быть на отдельной строке,
 * итого в методе получится 6 строк):
 * - создайте переменную с именем idea типа String и присвойте ей значение "I like Java!";
 * - выведите на консоль эту переменную через команду System.out.println(idea);
 * - присоедините к переменной idea строку "But I am a newbie.";
 * - создайте переменную year с типом int и присвойте ей текущий год.
 * - присоедините к переменной idea переменную year;
 * - выведите на консоль эту переменную через команду System.out.println(idea);
 */
public class Out {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        int year = 2022;
        idea += year;
        System.out.println(idea);
    }
}
