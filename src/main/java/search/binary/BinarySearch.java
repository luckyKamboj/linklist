package search.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,23,43,54,65,76,87,123,234,342,561,6545,7567,8567,8568};
        int target = 53;
        System.out.println("Index of target element : "+ binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
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
