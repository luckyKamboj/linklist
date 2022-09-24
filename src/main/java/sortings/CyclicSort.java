package sortings;

import java.util.Arrays;

public class CyclicSort  implements  Sort, Swapper{

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cyclicSort(arr)));
        System.out.println(Arrays.toString(cyclicSort(arr5)));
        System.out.println(Arrays.toString(cyclicSort(arr6)));
        System.out.println(Arrays.toString(cyclicSort(arr7)));
    }

    /**
     * Cyclic sort is used when numbers are in a sequence.
     * select first index element and move it to its exact index and then
     * select second index element and move it to its index and so on.
     * @param arr
     * @return
     */
    private static int[] cyclicSort(int[] arr) {
        int i =0;

        // find the smallest element so that we can use it to find the index of all the elements by subtracting it from
        // value of element at ith index.
        int smallestElement = CommonUtil.smallestElement(arr);
        while(i < arr.length){
            if(arr[i] == smallestElement + i){
                i++;
            }else{
                Swapper.swap(arr, i, arr[i] -smallestElement );
            }
        }
        return arr;
    }
}
