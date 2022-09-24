package leetcode;

import java.util.TreeSet;
// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class Question4 {

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(getMedian(arr1, arr2));
    }

    private static double getMedian(int[] first, int[] second) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(Integer ele :first){
            tree.add(ele);
        }
        for(Integer ele :second){
            tree.add(ele);
        }

        return 0.022;
    }
}
