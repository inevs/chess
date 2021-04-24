package chess.model.figure;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class KingTest {
    @Test
    void whiteStringRepresentationIsK() {
        King king = new King(false);
        assertThat(king.toString(), is("K"));
    }

    @Test
    void blackStringRepresentationIs_k() {
        King king = new King(true);
        assertThat(king.toString(), is("k"));
    }
}