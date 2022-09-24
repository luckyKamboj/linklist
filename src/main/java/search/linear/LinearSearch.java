package search.linear;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int totalNumbers ;
        System.out.println("Enter the size of array : ");
        totalNumbers= scanner.nextInt();

        int[] arrayElements = new int[totalNumbers];

        System.out.println("Enter the elements value :");
        for (int index = 0; index < totalNumbers; index++) {
             arrayElements[index] = scanner.nextInt();
        }

        System.out.println("Enter the element you want to search in the array");
        int target = scanner.nextInt();

        System.out.println("Is element present : " + isPresent(arrayElements, target));

        System.out.println("Enter the element to know index of element");
        target = scanner.nextInt();

        System.out.println("Index of target element : " + elementIndex(arrayElements, target));

    }

    private static int elementIndex(int[] arrayElements, int target) {
        if(arrayElements == null || arrayElements.length == 0){
            return -1;
        }
        for (int index = 0; index < arrayElements.length; index++) {
                  if(arrayElements[index] == target){
                      return index;
                  }
        }
        return -1;
    }

    static boolean isPresent(int[] arrayElements, int target) {
        if(arrayElements == null || arrayElements.length == 0){
            return false;
        }

        for (int indexVal: arrayElements) {
            if(indexVal == target){
                return true;
            }
        }
        return false;
    }



}
