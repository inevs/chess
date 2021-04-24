package chess.model.figure;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BishopTest {
    @Test
    void whiteStringRepresentationIsB() {
        Bishop bishop = new Bishop(false);
        assertThat(bishop.toString(), is("B"));
    }

    @Test
    void blackStringRepresentationIs_b() {
        Bishop bishop = new Bishop(true);
        assertThat(bishop.toString(), is("b"));
    }
}