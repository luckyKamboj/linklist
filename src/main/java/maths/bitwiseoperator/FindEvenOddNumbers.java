package maths.bitwiseoperator;

public class FindEvenOddNumbers {

    public static void main(String[] args) {
        int element = 9;
        System.out.println("Is 0" + element+" Even : " + isEven(element));
        element = 16;
        System.out.println("Is " + element+" Even : " + isEven(element));
    }

    /**
     * With & operator adding 1 in last bit will return 1 if last bit of element is 1 and gives 0 if last bit is 0.
     * for ex : for element 9 -> 1001 & 1 answer will be 1001 and
     * for element 16 -> 10000 & 1 will give 10000 as & operator returns 1 if and only if both the bits are 1 else false.
     * @param element
     * @return
     */
    private static boolean isEven(int element) {
        return (element & 1) == 0;
    }
}
