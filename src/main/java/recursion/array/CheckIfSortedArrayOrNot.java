package recursion.array;

public class CheckIfSortedArrayOrNot {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,51,71,81,99,88,96,122,123,123,150,177,266,267,270};
        System.out.println(checkIfSortedOrNot(arr, 0));
    }

    private static boolean checkIfSortedOrNot(int[] arr, int start) {
        if(start == arr.length -1){
            return true;
        }
        if(arr[start] > arr[start +1]){
            return false;
        }
        return checkIfSortedOrNot(arr, start + 1);
    }
}
