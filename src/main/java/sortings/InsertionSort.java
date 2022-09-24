package sortings;

import java.util.Arrays;

// stable, best case - n , worst case -n**2
// better than bubbleSort
// best for less numb of elements.
// Useful in hybrid sorting algo.
public class InsertionSort implements Swapper,Sort{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr1)));
        System.out.println(Arrays.toString(insertionSort(arr2)));
        System.out.println(Arrays.toString(insertionSort(arr3)));
        System.out.println(Arrays.toString(insertionSort(arr4)));

    }

    //In first iteration sort first 2 indexes first, in second iteration sort first 3 indexes and so on.
    private static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for(int j = i+1; j > 0; j--){
                if (arr[j - 1] <= arr[j]) {
                    break;
                }
                // swap ith element on that index
                Swapper.swap(arr, j , j-1);
            }
        }
        return arr;
    }
}
