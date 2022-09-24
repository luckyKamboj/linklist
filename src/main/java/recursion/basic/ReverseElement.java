package recursion.basic;

public class ReverseElement {
    public static void main(String[] args) {
        // 1234 == 4321

        System.out.println(reverseElement(1232));
        System.out.println(reverseElement(4321));
    }

    private static int reverseElement(int element) {
        int digit = (int) Math.log10(element) + 1;
        int ans = 0;
        return helper(element, digit, ans);
    }

    private static int helper(int element, int digit, int ans) {
        if(element == 0){
            return ans;
        }
        int reminder = element % 10;
        ans +=reminder * Math.pow(10, digit -1);
        return helper(element/10, digit -1, ans );
    }
}
