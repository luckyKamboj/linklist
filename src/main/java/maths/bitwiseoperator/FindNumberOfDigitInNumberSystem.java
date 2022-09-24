package maths.bitwiseoperator;

/**
 * Its logic is
 */
public class FindNumberOfDigitInNumberSystem {

    public static void main(String[] args) {
        int number = 16;
        int base = 10;

        int noOfDigits = (int) (Math.log(number)/Math.log(base)) + 1;
        System.out.println(noOfDigits);
    }
}
