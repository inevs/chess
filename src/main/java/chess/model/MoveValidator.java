package chess.model;

public class MoveValidator {
    static String regex = "[a-h][1-8]-[a-h][1-8]";

    public static boolean isValidMove(String input) {
        return input.matches(regex);
    }
}
