package kyu8.switch_it_up;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
