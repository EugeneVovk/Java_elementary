package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {
    @Test
    public void wayRookIs6() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 6;
        int expected = 6;
        int actual = ChessBoard.wayRook(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wayRookIs5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        int expected = 5;
        int actual = ChessBoard.wayRook(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wayRookIs0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        int expected = 0;
        int actual = ChessBoard.wayRook(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wayKnightIs5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayKnightIs7() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayKnightIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isMinus1ThenWayKnightIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayKnightIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayKnightIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isMinus1ThenWayKnightIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayKnightIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayKnightIs0() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayKnightIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayKnightIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.wayKnight(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}
