package chess.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BoardTest {

    @Test
    void showEmptyBoard() {
        Board board = new Board();
        assertThat(board.show(), is("8\n7\n6\n5\n4\n3\n2\n1\n A B C D E F G H\n"));
    }
}