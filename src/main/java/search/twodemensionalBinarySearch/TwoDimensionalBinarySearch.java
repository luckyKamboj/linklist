package search.twodemensionalBinarySearch;

import java.util.Arrays;

public class TwoDimensionalBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5, 6},
                {10,15,18,25,29,40},
                {15,18,20,26,40,65},
                {24,25,26,28,70,88},
                {40,65,76,78,80,98}};
        int target =78;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =18;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =1;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =4;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =40;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        arr = new int[][]{
                { 1, 2, 3, 4, 5, 6},
                {10,15,18,25,29,40},
                {15,18,20,26,40,65}};
        target =68;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =65;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =1;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));

        System.out.println( "Third");
        arr = new int[][]{
                { 1, 2, 3, 4, 5, 6},
                {10,15,18,25,29,40},
                {115,118,120,216,240,265}};
        target =168;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =265;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =1;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =118;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =6;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =115;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
        target =-1;
        System.out.println( "Element index is :"+ Arrays.toString(targetElement(arr, target)));
    }

    private static int[] targetElement(int[][] arr, int target) {
        int row = 0;
        int column = arr[0].length -1;

        while(column >= 0 && row <= arr.length -1){
            if(arr[row][column] > target){
                column --;
            }else if(arr[row][column]< target){
                row++;
            }else{
                return new int[]{row, column};
            }
        }
        return new int[]{-1,-1};
    }
}
