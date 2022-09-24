package sortings;

import java.util.Arrays;
// stable, best case - n , worst case - n**2
public class BubbleSort implements Swapper, Sort{

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr1)));
        System.out.println(Arrays.toString(bubbleSort(arr2)));
        System.out.println(Arrays.toString(bubbleSort(arr3)));
        System.out.println(Arrays.toString(bubbleSort(arr4)));
    }
    /**
     * bubble sort is when you sort the array by checking adjacent elements and swaps the element if jth element is smaller than j-1th element.
     *
     * @param arr
     * @return
     */
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length -1; i++) {
            boolean isSwapped = false;
            for(int j = 1 ; j <= arr.length -i ; j++ ){
                if(arr[j-1] > arr[j]){
                    Swapper.swap(arr,j-1, j);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return arr;
            }
        }
        return arr;
    }
}
