package kyu8.count_by_x;

public class Kata {
    public static int[] countBy(int x, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = (i + 1) * x;
        }

        return result;
    }
}
