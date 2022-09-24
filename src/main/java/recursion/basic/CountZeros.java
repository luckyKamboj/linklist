package recursion.basic;

public class CountZeros {

    public static void main(String[] args) {
        // 120320   == 2
        System.out.println(countZeros(1203210,0));
        System.out.println(countZeros(1200010,0));
        System.out.println(countZeros(1234567890,0));

    }

    private static int countZeros(int element, int count) {
        if(element <= 0){
            return count;
        }
        if(element % 10 == 0){
            return countZeros(element/10, ++count);
        }else{
            return countZeros(element/10, count);
        }

    }
}
