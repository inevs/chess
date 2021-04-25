package chess.cli;

import chess.model.Board;
import chess.model.ChessGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Starting point of the command line interface
 */
public class Cli {

    private static ChessGame game = new ChessGame(new Board());
    /**
     * The entry point of the CLI application.
     *
     * @param args The command line arguments passed to the application
     */
    public static void main(String[] args) {

        while (!game.shouldExitGame()) {
            String output = game.showBoard();
            System.out.println(output);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Move\n");
            try {
                String input = br.readLine();
                game.acceptInput(input);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
