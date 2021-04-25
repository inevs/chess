package chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChessGameTest {

    @Test
    void initializesBoard() {
        MyBoard board = new MyBoard();
        ChessGame game = new ChessGame(board);
        assertTrue(board.isInitialized);
    }

    private static class MyBoard extends Board {
        public boolean isInitialized() {
            return isInitialized;
        }

        private boolean isInitialized;

        @Override
        public void initializeBoard() {
            isInitialized = true;
        }
    }
}