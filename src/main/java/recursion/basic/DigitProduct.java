package recursion.basic;

public class DigitProduct {
    public static void main(String[] args) {
        // 1234 = 24

        System.out.println(digitProduct(1203210,1));
        System.out.println(digitProduct(12321,1));
        System.out.println(digitProduct(1200010,1));
        System.out.println(digitProduct(1234567890,1));
        System.out.println(digitProduct(123456789,1));
        System.out.println(digitProduct(1234,1));
        System.out.println(digitProduct(12345,1));

    }

    private static int digitProduct(int element, int product) {
        if(element == 0){
            return product;
        }
        return digitProduct(element/10, product * (element %10));
    }
}
