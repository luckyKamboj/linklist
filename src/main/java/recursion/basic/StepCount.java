package recursion.basic;

public class StepCount {
    public static void main(String[] args) {
        //14    == 6     , 7,6,3,2,1,0
        System.out.println(countStep(4));
        System.out.println(countStep(14));

    }

    private static int countStep(int element) {
        return helper(element, 0);
    }

    private static int helper(int element, int counter) {
        if(element == 0){
            return counter;
        }
        element = element/2;
        if(element % 2 != 0){
            return helper(element -1 , counter +2);
        }
        return helper(element, counter + 1);
    }
}
