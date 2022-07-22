package ru.job4j.condition;

public class ChessBoard {
    /**
     * Метод, который принимает 4 параметра - координаты X и Y начальной
     * и конечной клетки.
     * Метод должен вернуть количество клеток,
     * которое преодолеет ладья во время движения по доске.
     * Важно понимать, что прежде чем проводить вычисления,
     * необходимо проверить движется ли фигура по прямой линии - это значит,
     * что одна из координат во время движения не изменится.
     */
    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    /**
     * Метод выполняет следующее:
     * - проверяет валидность входных параметров (координат).
     * Они должны находиться в пределах от 0 до 7.
     * - проверяет, что фигура выполняет ход как фигура слон в шахматах -
     * напоминаем что в этом случае фигура ходит по диагонали;
     * - если фигура ходит под диагонали, то необходимо посчитать число клеток,
     * которые проходит фигура на своем пути и вернуть число этих клеток.
     * В ином случае метод должен вернуть 0.
     */
    public static int wayKnight(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
