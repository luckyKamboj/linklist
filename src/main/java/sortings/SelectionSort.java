package sortings;

import java.util.Arrays;

public class SelectionSort  implements Swapper, CommonUtil, Sort{

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(selectionSort(arr1)));
        System.out.println(Arrays.toString(selectionSort(arr2)));
        System.out.println(Arrays.toString(selectionSort(arr3)));
        System.out.println(Arrays.toString(selectionSort(arr4)));
    }

    // find the maximum element and place it at the last index and then find largest in remaining array and place at the last index.
    // repeat the step till the arr length becomes 0.
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length -1 - i;

            // find max element index
            int maxIndex = CommonUtil.getMaxElementIndex(arr,0, last);

            // swap with last element of remaining array.
            Swapper.swap(arr, maxIndex, last);
        }
        return arr;
    }
}
