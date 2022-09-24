package search.binary;

import java.util.Arrays;

public class BinarySearchFirstAndLastOccurrence {
    public static void main(String[] args) {
        char[] arr = {'b','d','h','h','h','h','j','o','p','t','w'};
        int[] targetArr = {-1,-1};
        char target = 'h';
        targetArr[0] = binarySearch(arr, target, true);
        targetArr[1] = binarySearch(arr, target, false);
        System.out.println(Arrays.toString(targetArr));
    }

    private static int binarySearch(char[] arr, char target, boolean isStartingElement) {
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = (start + end) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid]< target){
                start = mid + 1;
            }else{
                if(isStartingElement){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return isStartingElement ? start: start-1;
    }

}
