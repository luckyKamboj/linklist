package recursion.array;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,323,54,6,54,7,867,8,87,65,56,45,34,4,3,32,32,3,2};
        int target = 4;
        System.out.println(targetIndex(arr, target, 0));
        target = 12;
        System.out.println(targetIndex(arr, target, 0));
        target = 2;
        System.out.println(targetIndex(arr, target, 0));
        target = 1;
        System.out.println(targetIndex(arr, target, 0));
    }

    private static int targetIndex(int[] arr, int target, int start) {
        if(start > arr.length -1){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        return targetIndex(arr, target, start + 1);
    }
}
