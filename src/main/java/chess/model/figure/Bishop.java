package chess.model.figure;

public class Bishop implements Figure {
    private boolean isBlack;

    public Bishop(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        if (isBlack) {
            return "b";
        } else {
            return "B";
        }
    }

}
