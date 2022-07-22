package ru.job4j.loop;

/**
 * В классе Board написать метод public static void paint(int width, int height),
 * который должен рисовать шахматную доску из символов x и пробелов.
 */
public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paint(8, 8);
    }
}
