package kyu8.switch_it_up;

class Kata {
    public static String switchItUp(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> throw new IllegalArgumentException("Invalid number: " + num);
        };
    }
}
