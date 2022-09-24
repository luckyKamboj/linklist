package search.binary;

public class BinarySearchWithRecursion {

    public static void main(String[] args) {
        int[] arr = {12,23,43,54,65,76,87,123,234,342,561,6545,7567,8567,8568};
        int target = 8568;
        System.out.println("Index of target element : "+ binarySearch(arr, 0, arr.length -1, target));

    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        int mid = (start + end) /2;
        if(arr[mid] == target){
            return mid;
        }
        if(start >end){
            return -1;
        }
        if(arr[mid] > target){
            return binarySearch(arr, start, mid-1, target);
        }else{
            return binarySearch(arr, mid+1, end, target);
        }
    }
}
