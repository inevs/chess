package chess.model.figure;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RookTest {
    @Test
    void whiteStringRepresentationIsR() {
        Rook rook = new Rook(false);
        assertThat(rook.toString(), is("R"));
    }

    @Test
    void blackStringRepresentationIs_r() {
        Rook rook = new Rook(true);
        assertThat(rook.toString(), is("r"));
    }
}