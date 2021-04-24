package chess.model;
import chess.model.figure.Figure;
import chess.model.figure.Pawn;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CellTest {

    @Test
    void emptyCellToStringIsSpace() {
        Cell emptyCell = new Cell();
        assertThat(emptyCell.toString(), is(" "));
    }

    @Test
    void cellWithFugureToStringIsStringOfFigure() {
        Cell pawnCell = new Cell();
        Figure whitePawn = new Pawn(false);
        pawnCell.setFigure(whitePawn);
        assertThat(pawnCell.toString(), is("P"));
    }
}