package chess.model.figure;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class KnightTest {
    @Test
    void whiteStringRepresentationIsN() {
        Knight knight = new Knight(false);
        assertThat(knight.toString(), is("N"));
    }

    @Test
    void blackStringRepresentationIs_n() {
        Knight knight = new Knight(true);
        assertThat(knight.toString(), is("n"));
    }
}