package sortings;

public interface CommonUtil {
    static int getMaxElementIndex(int[] arr, int start, int length) {
        int index = start;
        for (int j = 1; j <= length; j++) {
            if(arr[index] < arr[j]){
                index = j;
            }
        }
        return index;
    }

    static int smallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int value: arr) {
            if(smallest > value){
                smallest = value;
            }
        }
        return smallest;
    }
    static int[] getDuplicateAndMissingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }


}
