package chess.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MoveTest {

    @Test
    void parsesCellIndizesFromInput() {
        Move move = new Move("e2-e3");
        assertThat(move.start, is("e2"));
        assertThat(move.end, is("e3"));
    }
}