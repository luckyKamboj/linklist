package recursion.sortings;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {123,43,5,4,65,5,74,3,45,45,3,4,4,3,23,7,432,34,345,436,54,34,6567,67,32,31};
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr,int start,  int end) {
        if(end - start == 1){
            return;
        }
        int mid = (end + start) /2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k =0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while( i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < end -start ; l++) {
            arr[start + l] = mix[l];
        }
    }
}
