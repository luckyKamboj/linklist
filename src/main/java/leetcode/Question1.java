package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class Question1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1,-2,-3,-4,-5}, -8))) ;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++){
            int remainingValue = target - nums[i];
            if(map.containsKey(remainingValue)){
                return new int[]{map.get(remainingValue), i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int []{-1,-1};
    }

}
