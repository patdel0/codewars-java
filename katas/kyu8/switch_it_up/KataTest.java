package kyu8.switch_it_up;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class KataTest {
    @ParameterizedTest
    @CsvSource({
            "0, Zero", "1, One", "2, Two", "3, Three", "4, Four",
            "5, Five", "6, Six", "7, Seven", "8, Eight", "9, Nine"
    })
    void returnsWordForDigit(int num, String expected) {
        assertEquals(expected, Kata.switchItUp(num));
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, 10 })
    public void throwsExceptionIfNotBetween0And9(int num) {
        assertThrows(IllegalArgumentException.class, () -> Kata.switchItUp(num));
    }
}
