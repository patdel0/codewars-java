package kyu8.count_by_x;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.argumentSet;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class KataTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                argumentSet("x=2, n=1", 2, 1, new int[] { 2 }),
                argumentSet("x=2, n=4", 2, 4, new int[] { 2, 4, 6, 8 }),
                argumentSet("x=5, n=7", 5, 7, new int[] { 5, 10, 15, 20, 25, 30, 35 }),
                argumentSet("x=1, n=9", 1, 9, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsFirstMultiplesOfX(int x, int n, int[] expected) {
        assertArrayEquals(expected, Kata.countBy(x, n));
    }
}
