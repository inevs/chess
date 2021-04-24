package chess.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BoardTest {

    @Test
    void showInitializedBoard() {
        Board board = new Board();
        board.initializeBoard();
        assertThat(board.show(), is("8 r b n q k n b r \n7 p p p p p p p p \n6                 \n5                 \n4                 \n3                 \n2 P P P P P P P P \n1 R B N Q K N B R \n A B C D E F G H\n"));
    }
}