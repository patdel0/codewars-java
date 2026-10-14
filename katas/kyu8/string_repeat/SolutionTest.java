package kyu8.string_repeat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(6, "I", "IIIIII"),
                arguments(5, "Hello", "HelloHelloHelloHelloHello"));
    }

    @ParameterizedTest
    @MethodSource("cases")
    void repeatsStringNTimes(int timesToRepeat, String string, String expectedResult) {
        assertEquals(expectedResult, Solution.repeatStr(timesToRepeat, string));
    }

}
