package leetcode;

public class Question7 {
    public static void main(String[] args) {
        System.out.println(reverseElement(-234567898));
    }

    private static int reverseElement(int value) {
        int rev = 0;
        while (value != 0) {
            int div = value % 10;
            value /= 10;
            if (notValid(rev, div)){
                return 0;
            }
            rev = rev * 10 + div;
        }
        return rev;

    }

    private static boolean notValid(int rev, int div) {
        return greater(rev, div) || lower(rev, div);
    }

    private static boolean lower(int rev, int div) {
        return rev < Integer.MIN_VALUE/10
                || (rev == Integer.MIN_VALUE / 10
                        && div < -8);
    }

    private static boolean greater(int rev, int div) {
        return rev > Integer.MAX_VALUE/10
                || (rev == Integer.MAX_VALUE / 10
                        && div > 7);
    }
}
