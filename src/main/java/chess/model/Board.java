package chess.model;

public class Board {

    private Cell[][] checkerboard = new Cell[8][8];

    public String show() {
        String output = "";
        for (int i = checkerboard.length - 1; i >= 0 ; i--) {
            output += i + 1 + "\n";
        }
        output += " A B C D E F G H\n";
        return output;
    }

}
