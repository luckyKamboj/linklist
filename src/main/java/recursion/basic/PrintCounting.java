package recursion.basic;

public class PrintCounting {
    public static void main(String[] args) {
        System.out.println("Counting");
        printCount(5);
        System.out.println("Reverse Counting");
        printCountRev(5);
        System.out.println("Both Counting");
        printCountBoth(5);
    }

    private static void printCountBoth(int element) {
        if(element == 0){
            return;
        }
        System.out.println(element);
        printCountBoth(element -1);
        System.out.println(element);
    }

    private static void printCountRev(int element) {
        if(element == 0){
            return;
        }
        System.out.println(element);
        printCountRev(element-1);
    }

    private static void  printCount(int element) {
        if(element == 0){
            return;
        }
        printCount(element -1);
        System.out.println(element);
    }
}
