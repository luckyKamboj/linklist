package sortings.cyclic.questions;

import sortings.CommonUtil;
import sortings.Swapper;

import java.util.Arrays;

public class FindDuplicateAndMissingElement implements Swapper {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,8,3,1,5,4,6};
        performCircularSorting(arr);
        System.out.println(Arrays.toString(arr));
        arr = CommonUtil.getDuplicateAndMissingElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void performCircularSorting(int[] arr) {
        int i =0;
        while (i< arr.length){
            if(arr[i] != i+1 && arr[(arr[i]-1)] != arr[i]){
                Swapper.swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }
    }
}
