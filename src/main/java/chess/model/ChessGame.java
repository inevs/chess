package chess.model;

import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    private Board board;
    private boolean exitGame = false;
    private List<Move> moves = new ArrayList();

    public ChessGame(Board board) {
        this.board = board;
        this.board.initializeBoard();
    }

    public String showBoard() {
        return board.show();
    }

    public void acceptInput(String input) {
        if (input.equals("quit")) {
            exitGame = true;
        }
        if (input.equals("undo") && moves.size() > 0) {
            Move move = moves.get(moves.size() - 1);
            move.convertToUndoMove();
            board.makeMove(move);
            moves.remove(move);
        } else {
            Move move = new Move(input);
            board.makeMove(move);
            moves.add(move);
        }
    }

    public boolean shouldExitGame() {
        return exitGame;
    }
}
