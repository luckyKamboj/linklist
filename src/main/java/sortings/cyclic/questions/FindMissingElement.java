package sortings.cyclic.questions;

import sortings.CommonUtil;
import sortings.Swapper;

public class FindMissingElement implements Swapper {

    public static void main(String[] args) {
        int[] arr =new int[]{5,4,10,6,12,9,7,11};
        int smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println( "Element : " + findMissingElementIndex(arr, smallestElement));

        arr =new int[]{5,4,10,6,12,9,7,11,8,3};
        smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println( "Element : " + findMissingElementIndex(arr, smallestElement));

    }

    private static int findMissingElementIndex(int[] arr, int smallestElement) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+smallestElement){
                return i + smallestElement;
            }
        }
        return smallestElement + arr.length;
    }

    private static void performCyclicSort(int[] arr, int smallestElement) {
        int i =0;
        while(i< arr.length){
         if(arr[i] < arr.length + smallestElement &&  arr[i] != smallestElement + i){
             Swapper.swap(arr, i, arr[i] - smallestElement);
         }else{
             i++;
         }
        }
    }
}
