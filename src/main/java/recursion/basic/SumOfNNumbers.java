package recursion.basic;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sum(5, sum));
    }

    private static int sum(int number, int sum) {
        if(number == 0){
            return sum;
        }
        return sum(number-1, sum + number);
    }
}
