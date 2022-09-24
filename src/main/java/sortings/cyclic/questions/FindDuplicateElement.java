package sortings.cyclic.questions;

import sortings.CommonUtil;
import sortings.Swapper;

public class FindDuplicateElement implements Swapper {

    public static void main(String[] args) {
        int[] arr = {4,5,3,8,6,7,2,9,9};
        int smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println(duplicateElement(arr, smallestElement));

        arr = new int[]{4,5,3,5};
        smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println(duplicateElement(arr, smallestElement));

        arr = new int[]{};
        smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println(duplicateElement(arr, smallestElement));

    }

    private static String duplicateElement(int[] arr,int smallestElement ) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != smallestElement + i){
                int duplicateElement = arr[i];
                if(duplicateElement == arr[duplicateElement -smallestElement]){
                    return "" + duplicateElement;
                }
            }
        }
        return "No Duplicate Element";
    }

    private static void performCyclicSort(int[] arr, int smallestElement) {
        int i =0;
        while (i< arr.length){
            if(arr[i] != smallestElement +i && arr[arr[i]-smallestElement] != arr[i]){
                Swapper.swap(arr, i, arr[i]-smallestElement);
            }else{
                i++;
            }
        }
    }
}
