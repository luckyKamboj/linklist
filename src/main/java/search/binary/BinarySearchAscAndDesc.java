package search.binary;

public class BinarySearchAscAndDesc {
    public static void main(String[] args) {
        int[] arrAsc = {12,23,43,54,65,76,87,123,234,342,561,6545,7567,8567,8568};
        int[] arrDesc = {5882,987,867,657,655,453,423,312,303,213,123,122,111,101,99,76,74,54,45,34,2,-12,-32,-123,-654};
        int target = 54;
        int index = binarySearch(arrAsc, target, true);
        System.out.println("index in asc array : "+ index);
        target = 114;
        index = binarySearch(arrDesc, target, false);
        System.out.println("index in desc array : "+ index);

    }

    private static int binarySearch(int[] arr, int target, boolean isAscending) {
        int start =0;
        int end = arr.length;

        while(start<= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(arr[mid]< target){
                    start = mid+1;
                }else if(arr[mid]> target){
                    end = mid -1;
                }
            }else{
                if(arr[mid]< target){
                    end = mid -1;
                }else if(arr[mid]> target){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
