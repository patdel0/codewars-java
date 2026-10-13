package kyu8.switch_it_up;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class KataTest {
    @Test
    public void returnZeroWhen0Provided() {
        assertEquals(Kata.switchItUp(0), "Zero");
    }

    @Test
    public void returnOneWhen1Provided() {
        assertEquals(Kata.switchItUp(1), "One");
    }

    @Test
    public void returnNineWhen9Provided() {
        assertEquals(Kata.switchItUp(9), "Nine");
    }

    @Test
    public void throwsExceptionIfNotBetween0And9() {
        assertThrows(IllegalArgumentException.class, () -> Kata.switchItUp(10));
    }
}
