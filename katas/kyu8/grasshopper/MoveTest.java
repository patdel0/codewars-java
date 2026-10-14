package kyu8.grasshopper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MoveTest {
    @ParameterizedTest
    @CsvSource({
            // initial position, die roll (1-6), expected
            "1, 3, 7",
            "3, 5, 13",
            "999, 3, 1005"
    })
    void returnsCurrentPositionBasedOnDoubleRoll(int initialPos, int dieRoll, int expectation) {
        assertEquals(expectation, Move.move(initialPos, dieRoll));
    }

}
