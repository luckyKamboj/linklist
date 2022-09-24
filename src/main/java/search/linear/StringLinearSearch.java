package search.linear;

public class StringLinearSearch {

    public static void main(String[] args) {
        String value = "Lucky";
        char target = 'u';
        System.out.println(getCharIndex(value.toCharArray(), target));
        target = 'p';
        System.out.println(getCharIndex(value.toCharArray(), target));
        System.out.println(isPresent(value.toCharArray(), target));
    }

    static boolean isPresent(char[] toCharArray, char target) {
        if(toCharArray == null){
            return false;
        }
        for (char value : toCharArray) {
            if(value == target){
                return true;
            }
        }
        return false;
    }

    static int getCharIndex(char[] toCharArray, char target) {
        if(toCharArray == null || toCharArray.length ==0){
            return -1;
        }
        for (int index = 0; index < toCharArray.length; index++) {
            if(toCharArray[index] == target){
                return index;
            }
        }
        return -1;
    }
}
