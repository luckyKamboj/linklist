package recursion.basic;

public class SumOfDigits {
    public static void main(String[] args) {
        // 1342 == 10
        System.out.println(digitSum(1342));
        System.out.println(digitSum(134));
    }

    private static int digitSum(int element) {
        return helper(element, 0);
    }

    private static int helper(int element, int sum) {
        if (element ==0){
           return sum;
        }
        int reminder = element %10;

        return helper(element /10, sum + reminder);
    }
}
