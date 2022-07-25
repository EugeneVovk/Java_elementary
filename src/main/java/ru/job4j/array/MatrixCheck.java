package ru.job4j.array;

/**
 * Нужно проверить то, что строка, столбец или диагональ
 * в двухмерном массиве целиком заполнена символом 'X'.
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод должен проверить, что в квадратном массиве есть
     * строчки или столбцы, заполненные только символом 'X'
     */
    public static boolean isWin(char[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X'
                    && monoHorizontal(board, i)
                    || monoVertical(board, i)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
