package search.binary;

import java.util.Objects;

public class MountainArrayPeakElementWithoutDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,4,2,1};
        System.out.println("Index of peak element is : "+ getPeakElementInNonDuplicateElementArray(arr));
        arr = new int[] {19,10,9,8,7,6,4,2,1};
        System.out.println("Index of peak element is : "+ getPeakElementInNonDuplicateElementArray(arr));
        arr = new int[]{1,2,3,4,5,6,7,8,9,10,19};
        System.out.println("Index of peak element is : "+ getPeakElementInNonDuplicateElementArray(arr));
    }

    private static int getPeakElementInNonDuplicateElementArray(int[] arr) {

        if(Objects.isNull(arr) || arr.length<3) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = (start + end) /2;
            if(arr.length - 1 == mid){
                return mid;
            }
            if(arr[mid]> arr[mid+1]){
                end = mid;
            }else if(arr[mid]< arr[mid + 1]){
                start = mid + 1;
            }
        }
        return start;
    }
}
