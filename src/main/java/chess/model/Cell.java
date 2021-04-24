package chess.model;

import chess.model.figure.Figure;

public class Cell {
    private Figure figure;

    public boolean isFree() {
        return figure == null;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    public String toString() {
        if (isFree()) {
            return " ";
        } else {
            return figure.toString();
        }
    }
}
