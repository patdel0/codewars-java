package kyu8.count_of_positives;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void emptyInputReturnsEmptyArray() {
        assertArrayEquals(new int[0], Solution.countOfPositivesSumOfNegatives(new int[0]));
    }

    @Test
    void nullInputReturnsEmptyArray() {
        assertArrayEquals(new int[0], Solution.countOfPositivesSumOfNegatives(null));
    }

    @Test
    void singlePositiveIsCounted() {
        assertArrayEquals(new int[] { 1, 0 }, Solution.countOfPositivesSumOfNegatives(new int[] { 1 }));
    }

    @Test
    void singleNegativeIsSummed() {
        assertArrayEquals(new int[] { 0, -1 }, Solution.countOfPositivesSumOfNegatives(new int[] { -1 }));
    }

    @Test
    void zeroIsIgnored() {
        assertArrayEquals(new int[] { 0, 0 }, Solution.countOfPositivesSumOfNegatives(new int[] { 0 }));
    }

    @Test
    void mixedInputCountsAndSums() {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 };
        assertArrayEquals(new int[] { 10, -65 }, Solution.countOfPositivesSumOfNegatives(input));
    }
}
