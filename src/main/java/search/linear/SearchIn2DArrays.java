package search.linear;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int [][] arr = {{12,4,3,56},{657,86,867},{456,6886,43,43},{345,6,87,9765,34}};
        int target = 6886;
        System.out.println("Minimum of array is : " + getMinimumValue(arr));
        System.out.println("Maximum of array is : " + getMaxValue(arr));
        System.out.println("Return array index : " + Arrays.toString(elementPresentAt(arr, target)));
        target =432452;
        System.out.println("Return array index : " + Arrays.toString(elementPresentAt(arr, target)));

    }

    private static int[] elementPresentAt(int[][] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            for (int jindex = 0; jindex < arr[index].length; jindex++) {
                if(arr[index][jindex] == target){
                    return new int[]{index, jindex};
                }
            }
        }
        return new int[]{};
    }

    private static int getMaxValue(int[][] arr) {
        int target = Integer.MIN_VALUE;
        if(arr == null){
            return target;
        }
        for (int[] internalArr: arr) {
            for (int value: internalArr) {
                if(target < value){
                    target = value;
                }
            }
        }
        return target;
    }

    private static int getMinimumValue(int[][] arr) {
        int target = Integer.MAX_VALUE;
        if(arr == null){
            return target;
        }
        for (int[] internalArr: arr) {
            for (int value: internalArr) {
                if(target > value){
                    target = value;
                }
            }
        }
        return target;
    }
}
