package chess.model;

public class Cell {
    private Figure figure;

    public boolean isFree() {
        return figure == null;
    }
}
