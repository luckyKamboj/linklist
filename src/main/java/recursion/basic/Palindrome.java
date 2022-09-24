package recursion.basic;

public class Palindrome {
    public static void main(String[] args) {
        // 1234321  == true

        String element ="1234321";
        System.out.println(isPalindrome( element, 0, element.length() -1));
        element ="1233321";
        System.out.println(isPalindrome( element, 0, element.length() -1));
        element ="123332";
        System.out.println(isPalindrome( element, 0, element.length() -1));
        element ="010";
        System.out.println(isPalindrome( element, 0, element.length() -1));
        element ="10";
        System.out.println(isPalindrome( element, 0, element.length() -1));
        element ="01";
        System.out.println(isPalindrome( element, 0, element.length() -1));
    }

    private static boolean isPalindrome(String element, int startIndex, int endIndex) {
        if(startIndex == endIndex){
            return true;
        }
        if(element.charAt(startIndex) != element.charAt(endIndex)){
            return false;
        }
        return isPalindrome(element, startIndex+1, endIndex -1);
    }
}
