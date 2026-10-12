package kyu8.count_of_positives;

public class Solution {
    public static int[] countOfPositivesSumOfNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int positiveCount = 0;
        int negativeSum = 0;

        for (int n : input) {
            if (n > 0) {
                positiveCount++;
            }
            if (n < 0) {
                negativeSum += n;
            }
        }

        return new int[] { positiveCount, negativeSum };
    }
}
