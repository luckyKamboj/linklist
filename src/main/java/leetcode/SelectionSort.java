package leetcode;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {32,65,8,8,67,85,6,45,343,12,5,6,54,8,56,8,32,42,36,37,435,542,547,547,568,568,756756,4435,6757,6798,356754};
        System.out.println(selectionSort(arr));
    }

    private static String selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int value =i;
            for (int j = i; j <arr.length -1 ; j++) {
                if(arr[value] > arr[j+1]){
                    value = j+1;
                }
            }
            int temp = arr[i];
            arr[i] = arr[value];
            arr[value]= temp;
        }

        return Arrays.toString(arr);
    }

}
