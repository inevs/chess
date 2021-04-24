package chess.model.figure;

public class Rook implements Figure {
    private boolean isBlack;

    public Rook(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        if (isBlack) {
            return "r";
        } else {
            return "R";
        }
    }

}
