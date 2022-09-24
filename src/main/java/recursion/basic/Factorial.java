package recursion.basic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(8));
        System.out.println(factorial(15));
    }

    private static int factorial(int element) {
        if(element == 1){
            return element;
        }
        return element * factorial(element -1);
    }

}
