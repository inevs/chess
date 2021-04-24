package chess.model.figure;

public class King implements Figure {
    private boolean isBlack;

    public King(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        if (isBlack) {
            return "k";
        } else {
            return "K";
        }
    }

}
