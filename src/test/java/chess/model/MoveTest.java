package chess.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MoveTest {

    @Test
    void parsesCellIndizesFromInput() {
        Move move = new Move("e2-e3");
        assertThat(move.start.row, is(1));
        assertThat(move.start.column, is(4));
        assertThat(move.end.row, is(2));
        assertThat(move.end.column, is(4));
    }
}