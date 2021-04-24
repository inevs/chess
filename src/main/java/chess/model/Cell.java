package chess.model;

import chess.model.figure.Figure;
import chess.model.figure.Rook;

public class Cell {
    private Figure figure;

    public Cell(Figure figure) {
        this.figure = figure;
    }

    public boolean isFree() {
        return figure == null;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public String toString() {
        if (isFree()) {
            return " ";
        } else {
            return figure.toString();
        }
    }
}
