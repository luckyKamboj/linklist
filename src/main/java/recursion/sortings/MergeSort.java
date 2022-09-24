package recursion.sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {123,43,5,4,65,5,74,3,45,45,3,4,4,3,23,7,432,34,345,436,54,34,6567,67,32,31};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] start = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] end = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));
        return merge(start, end);
    }

    private static int[] merge(int[] start, int[] end) {
        int[] result = new int[start.length + end.length];
        int i = 0;
        int j =0;
        int k =0;
        while(i< start.length && j< end.length){
            if(start[i] < end[j]){
                result[k] = start[i];
                i++;
            }else {
                result[k] = end[j];
                j++;
            }
            k++;
        }
        while (i< start.length){
            result[k] = start[i];
            i++;
            k++;
        }
        while (j < end.length){
            result[k] = end[j];
            j++;
            k++;
        }

        return result;
    }
}
