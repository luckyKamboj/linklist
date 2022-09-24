package sortings.cyclic.questions;

import sortings.CommonUtil;
import sortings.Swapper;

import java.util.Arrays;

public class FindAllMissingElement implements Swapper {

    public static void main(String[] args) {
        int[] arr =new int[]{5,4,4,6,6,8,9,4,11};
        int smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println(Arrays.toString(arr));
        System.out.println(findAllMissingElements(arr, smallestElement));

        arr =new int[]{5,4,7,6,10,8,9,12,11};
        smallestElement = CommonUtil.smallestElement(arr);
        performCyclicSort(arr, smallestElement);
        System.out.println(Arrays.toString(arr));
        System.out.println(findAllMissingElements(arr, smallestElement));

    }

    private static String findAllMissingElements(int[] arr, int smallestElement) {
     StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != (i+smallestElement)){
                sb.append(i+smallestElement).append(", ");
            }
        }
        return sb.toString().equals("") ? "No Element Missing": sb.substring(0,sb.length()-2);
    }

    private static void performCyclicSort(int[] arr, int smallestElement) {
        int i = 0;

        while (i < arr.length){
            if(arr[i] != arr[arr[i] -smallestElement] && arr[i] != smallestElement + i){
                Swapper.swap(arr, i , arr[i] - smallestElement );
            }else {
                i++;
            }
        }
    }
}
