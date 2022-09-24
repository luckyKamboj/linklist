package recursion.sortings;

import sortings.Swapper;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {123,43,5,4,65,5,74,3,45,45,3,4,4,3,23,7,432,34,345,436,54,34,6567,67,32,31};
        int[] arr1 = new int[] {31,43,5,4,65,5,74,3,45,45,3,4,4,3,23,7,432,34,345,436,54,34,6567,67,32,123};
        int[] arr2 = new int[] {31,32,5,4,34,5,34,3,45,45,3,4,4,3,23,7,432,74,345,436,54,65,6567,67,43,123};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void quickSort(int[] arr, int low, int hi) {
        if(low >= hi){
            return;
        }

        int pivot = (low + hi)/2;
        int s = low;
        int e = hi;
        int pivotValue = arr[pivot];
        while(s <= e){
            if(arr[s] < pivotValue){
                s++;
                continue;
            }
            if(arr[e] > pivotValue){
                e--;
                continue;
            }
            Swapper.swap(arr, s, e);
            s++;
            e--;
        }
        quickSort(arr,low, e);
        quickSort(arr, s, hi);
    }

}
