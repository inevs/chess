package chess.model.figure;

public class Pawn implements Figure {

    private boolean isBlack;

    public Pawn(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        if (isBlack) {
            return "p";
        } else {
            return "P";
        }
    }
}
