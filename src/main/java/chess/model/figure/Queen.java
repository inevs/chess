package chess.model.figure;

public class Queen implements Figure {
    private boolean isBlack;

    public Queen(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        if (isBlack) {
            return "q";
        } else {
            return "Q";
        }
    }

}
