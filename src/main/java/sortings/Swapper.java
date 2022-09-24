package sortings;

public interface Swapper {

    static void swap(int[] arr, int start, int index) {
        int temp = arr[start];
        arr[start] = arr[index];
        arr[index] = temp;
    }

}
