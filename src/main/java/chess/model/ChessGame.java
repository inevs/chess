package chess.model;

public class ChessGame {
    private Board board;
    private boolean exitGame = false;

    public ChessGame() {
        board = new Board();
        board.initializeBoard();
    }

    public String showBoard() {
        return board.show();
    }

    public void acceptInput(String input) {
        if (input.equals("quit")) {
            exitGame = true;
        }
        
    }

    public boolean shouldExitGame() {
        return exitGame;
    }
}
