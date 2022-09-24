package leetcode;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {32,65,8,8,67,85,6,45,343,12,5,6,54,8,56,8,32,42,36,37,435,542,547,547,568,568,756756,4435,6757,6798,356754};
        System.out.println(bubbleSort(arr));
    }

    private static String bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean swapper = true;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapper = false;
                }
            }
            ++count;
            if(swapper){
               break;
            }
        }
        System.out.println(count);
        return Arrays.toString(arr);
    }
}
