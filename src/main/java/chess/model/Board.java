package chess.model;

import chess.model.figure.*;

import java.util.Arrays;
import java.util.List;

public class Board {

    private Cell[][] checkerboard;
    static List<String> columns = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");

    public Board() {
        checkerboard = new Cell[8][8];
    }

    public String show() {
        String output = "";
        for (int row = checkerboard.length - 1; row >= 0; row--) {
            output += row + 1 + " ";
            for (int column = 0; column < 8; column++) {
                Cell cell = checkerboard[row][column];
                output += cell.toString() + " ";
            }
            output += "\n";
        }
        output += "  " + String.join(" ", columns).toUpperCase();
        return output;
    }

    public void initializeBoard() {
        Cell[] blackBaseRow = baseRow(true);
        Cell[] blackPawnRow = pawnsRow(true);
        Cell[] whitePawnRow = pawnsRow(false);
        Cell[] whiteBaseRow = baseRow(false);
        checkerboard = new Cell[][] {
                whiteBaseRow,
                whitePawnRow,
                emptyCells(),
                emptyCells(),
                emptyCells(),
                emptyCells(),
                blackPawnRow,
                blackBaseRow
        };
    }

    private Cell[] baseRow(boolean isBlack) {
        Cell[] row = new Cell[]{
                new Cell(new Rook(isBlack)),
                new Cell(new Bishop(isBlack)),
                new Cell(new Knight(isBlack)),
                new Cell(new Queen(isBlack)),
                new Cell(new King(isBlack)),
                new Cell(new Knight(isBlack)),
                new Cell(new Bishop(isBlack)),
                new Cell(new Rook(isBlack))
        };
        return row;
    }

    public void makeMove(Move move) {
        CellIndex startIndex = cellIndexFor(move.start);
        Cell startCell = checkerboard[startIndex.row][startIndex.column];
        Figure figure = startCell.getFigure();
        startCell.setFigure(null);
        CellIndex endIndex = cellIndexFor(move.end);
        Cell endCell = checkerboard[endIndex.row][endIndex.column];
        endCell.setFigure(figure);
    }

    private CellIndex cellIndexFor(String stringIndex) {
        String startColumn =  stringIndex.substring(0, 1);
        String startRowString = stringIndex.substring(1, 2);
        return new CellIndex(Integer.parseInt(startRowString) - 1, columns.indexOf(startColumn));
    }

    private Cell[] pawnsRow(boolean isBlack) {
        Cell[] row = new Cell[8];
        for (int i = 0; i < 8; i++) {
            row[i] = new Cell(new Pawn(isBlack));
        }
        return row;
    }

    private Cell[] emptyCells() {
        Cell[] row = new Cell[8];
        for (int i = 0; i < 8; i++) {
            row[i] = new Cell(null);
        }
        return row;
    }
}
