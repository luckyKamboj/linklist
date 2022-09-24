package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Question3 {

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestNonRepeatingCharactersSize(str));
        str = "bbbbbb";
        System.out.println(longestNonRepeatingCharactersSize(str));
        str = "abcabcbb";
        System.out.println(longestNonRepeatingCharactersSize(str));
        str = "abcabdcebcb";
        System.out.println(longestNonRepeatingCharactersSize(str));
        str = "abba";
        System.out.println(longestNonRepeatingCharactersSize(str));
    }

    private static int longestNonRepeatingCharactersSize(String str) {
        int size = 0;
        int secondPointer = 0;
        int answer = 0;
        int firstPointer = 0;
        Map<Character, Integer> chSet = new HashMap<>();
        while(secondPointer < str.length()) {
            if (!chSet.containsKey(str.charAt(secondPointer))){
                ++size;
            }else{
                int val = chSet.remove(str.charAt(secondPointer));
                if(firstPointer < val){
                    firstPointer = val;
                }
                answer = findMax(answer, size);
                size = secondPointer - firstPointer ;
            }
            chSet.put(str.charAt(secondPointer), secondPointer);
            secondPointer++;
        }
        return findMax(answer, size);
    }

    private static int findMax(int answer, int size) {
        return Math.max(answer, size);

    }
}
