package chess.model.figure;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class QueenTest {
    @Test
    void whiteStringRepresentationIsQ() {
        Queen queen = new Queen(false);
        assertThat(queen.toString(), is("Q"));
    }

    @Test
    void blackStringRepresentationIs_q() {
        Queen queen = new Queen(true);
        assertThat(queen.toString(), is("q"));
    }
}