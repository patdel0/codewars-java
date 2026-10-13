package kyu8.switch_it_up;

class Kata {
    public static String switchItUp(int num) {
        String[] numMap = new String[] {
                "Zero",
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine"
        };

        return numMap[num];
    }
}
