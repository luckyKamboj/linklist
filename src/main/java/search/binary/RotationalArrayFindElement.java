package search.binary;

public class RotationalArrayFindElement {

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,0,1,2,3,4};
        int start = 0;
        int end = arr.length -1;
        int pivot;
        int firstTry;
        int target = 1;
        pivot = findPivot(arr, start, end);
        System.out.println("Pivot element is : "+ pivot);
        firstTry = binarySearch(arr, target, start, pivot);
        if(firstTry == -1){
            firstTry = binarySearch(arr, target, pivot, end);
        }
        System.out.println(" Element is at position : " +  firstTry);
        arr = new int[]{0,1,2,3,4,6,7,8,9,10};
        pivot = findPivot(arr, start, end);
        System.out.println("Pivot element is : "+ pivot);
        firstTry = binarySearch(arr, target, start, pivot);
        if(firstTry == -1){
            firstTry = binarySearch(arr, target, pivot, end);
        }
        System.out.println(" Element is at position : " +  firstTry);

        arr = new int[]{10,0,1,2,3,4,6,7,8,9};
        pivot = findPivot(arr, start, end);
        System.out.println("Pivot element is : "+ pivot);
        firstTry = binarySearch(arr, target, start, pivot);
        if(firstTry == -1){
            firstTry = binarySearch(arr, target, pivot, end);
        }
        System.out.println(" Element is at position : " +  firstTry);

    }

    private static int binarySearch(int[] arr, int target,int start, int end) {
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

    private static int findPivot(int[] arr, int start, int end) {
        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid -1]){
                return mid -1;
            }
            if(arr[mid] >= arr[start]){
                start = mid;
            }else if(arr[mid] < arr[end]){
                end = mid -1;
            }
        }
        return start;
    }

}
