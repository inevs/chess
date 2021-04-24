package chess.model.figure;

public class Knight implements Figure {
    private boolean isBlack;

    public Knight(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        if (isBlack) {
            return "n";
        } else {
            return "N";
        }
    }

}
