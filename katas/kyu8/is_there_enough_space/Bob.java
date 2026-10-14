package kyu8.is_there_enough_space;

public class Bob {
    public static int enough(int cap, int on, int wait) {
        return Math.max(0, wait + on - cap);
    }
}
