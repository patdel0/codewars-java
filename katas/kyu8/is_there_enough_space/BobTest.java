package kyu8.is_there_enough_space;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BobTest {
    @Test
    void return0IfAllPassengersFitInBus() {
        assertEquals(0, Bob.enough(10, 5, 5));
        assertEquals(0, Bob.enough(20, 5, 5));
        assertEquals(0, Bob.enough(84, 41, 40));
        assertEquals(0, Bob.enough(100, 1, 0));
    }

    @Test
    void returnAmountThatWontFitWhenFull() {
        assertEquals(1, Bob.enough(10, 9, 2));
        assertEquals(10, Bob.enough(100, 60, 50));
    }
}
