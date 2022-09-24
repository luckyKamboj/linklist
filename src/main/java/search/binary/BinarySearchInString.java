package search.binary;

public class BinarySearchInString {
    public static void main(String[] args) {
        char[] arr = {'b','d','h','h','h','h','j','o','p','t','w'};
        char target = 'd';
        System.out.println("Index of target element : " + binarySearch(arr, target));
    }

    private static int binarySearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid]< target){
                start = mid + 1;
            }
        }
        return -1;
    }
}
