package leetcode;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(new Question5().longestPalindrome("babad"));
        System.out.println(new Question5().longestPalindrome1("cbbd"));
          }

    public String longestPalindrome(String str) {

        int length =0;
        String result = null;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() ; j > i; j--) {
                String newString = str.substring(i, j);
                int newLength =newString.length();
                if(isPalindrom(newString) &&  newLength> length){
                    length =  newLength;
                    result = newString;
                }
            }
        }
        return result;
    }

    private static boolean isPalindrom(String str){
        int  i =0;
        int j = str.length()-1;

        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome1(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
