package ru.job4j.condition;

/**
 * В переменных first и one хранятся разные адреса памяти.
 * Оператор равенства сравнивает адреса и возвращает false.
 * Запомните: для ссылочных типов нельзя использовать оператор равенства (==).
 * Чтобы проверить равенство ссылочных типов, нужно использовать метод equals.
 * Метод equals для String сравнивает значения, записанные в Heap.
 * Если области памяти заполнены одинаково, то метод вернет значение true.
 */
public class StringEq {
    public static void main(String[] args) {
        String first = new String("one");
        String one = new String("one");
        if (first == one) {
            System.out.println("first equals one");
        } else {
            System.out.println("first doesn't equal one");
        }
    }
}
