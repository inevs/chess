package chess.model;

import chess.model.figure.*;

public class Board {

    private Cell[][] checkerboard;

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
        output += " A B C D E F G H\n";
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
