package Strings;

public class WordReverse {
    public static void main(String[] args) {
        System.out.println(wordReverse("This is it "));
        System.out.println(wordReverse("This is it"));
        System.out.println(wordReverse("Test     the   functionality    "));
        System.out.println(wordReverse("Test  the functionality"));
    }

    /**
     *  Step 1 : Trim the given String and remove multiple whitespaces within the words as well.
     *  Step 2 : Split the String into String Array
     *  Step 3 : Iterate String Array from last element to first element and  avoid whitespace at the end of the String
      */
    private static String wordReverse(String string) {

        // to optimize the object creation we are using StringBuilder instead of String
        StringBuilder sb=new StringBuilder();

        // Step 1
        // To remove more than 1 whitespace between the words.
        //  //s stands for whitespace and {2,} matches any string that contains a sequence of at least 2 whitespaces
        // Syntax of regular expression -> n{X,}  where n stands for the element and X is the least occurrence of n in a String.
        String trimmedString = string.trim().replaceAll("\\s{2,}", " ");

        // Step 2
        String[] str = trimmedString.split(" ");

        // Step 3
        for(int i=str.length-1;i>=0;i--) {
            sb.append(str[i]);
            // to avoid whitespace at the end of the string
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

}
