package chess.model;

import java.util.Arrays;
import java.util.List;

public class Move {

    String start;
    String end;

    public Move(String input) {
        if (MoveValidator.isValidMove(input)) {
            String[] splitInput = input.split("-");
            start = splitInput[0];
            end = splitInput[1];
        }
    }

    public Move(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public void convertToUndoMove() {
        String temp = start;
        start = end;
        end = temp;
    }
}
