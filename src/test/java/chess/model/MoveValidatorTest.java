package chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveValidatorTest {
    @Test
    void validatesValidMove() {
        MoveValidator validator = new MoveValidator();
        assertTrue(validator.isValidMove("e2-e4"));
    }
    @Test
    void validatesInValidMove() {
        MoveValidator validator = new MoveValidator();
        assertFalse(validator.isValidMove("e12-4"));
    }
}