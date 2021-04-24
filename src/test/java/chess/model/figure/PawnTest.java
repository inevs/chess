package chess.model.figure;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PawnTest {
    @Test
    void whiteStringRepresentationIsP() {
        Pawn pawn = new Pawn(false);
        assertThat(pawn.toString(), is("P"));
    }

    @Test
    void blackStringRepresentationIs_p() {
        Pawn pawn = new Pawn(true);
        assertThat(pawn.toString(), is("p"));
    }
}