package chess.cli;

import chess.model.Board;

/**
 * Starting point of the command line interface
 */
public class Cli {

    private static Board board = new Board();
    /**
     * The entry point of the CLI application.
     *
     * @param args The command line arguments passed to the application
     */
    public static void main(String[] args) {
        board.initializeBoard();
        String output = board.show();
        System.out.println(output);
    }
}
