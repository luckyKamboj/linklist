package recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetAndAsciiValue {

    public static void main(String[] args) {
        String str = "abc";
        String processed = "";
        subsetAndAsciiValue(processed, str);
        System.out.println("");
        System.out.println(subsetAndAsciiValueList(processed, str));

    }

    private static void subsetAndAsciiValue(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            if(!processed.isEmpty()){
                System.out.print(processed + ", ");
            }
            return;
        }
        char ch = unprocessed.charAt(0);
        subsetAndAsciiValue(processed + ch , unprocessed.substring(1));
        subsetAndAsciiValue(processed, unprocessed.substring(1));
        subsetAndAsciiValue(processed + (int)ch, unprocessed.substring(1));
    }

    private static List<String> subsetAndAsciiValueList(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            if(!processed.isEmpty()){
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(processed);
                return arrayList;
            }
            return new ArrayList<>();
        }
        char ch = unprocessed.charAt(0);
        List<String>   left = subsetAndAsciiValueList(processed + ch , unprocessed.substring(1));
        List<String>  right = subsetAndAsciiValueList(processed, unprocessed.substring(1));
        List<String>  ascii = subsetAndAsciiValueList(processed + (int)ch, unprocessed.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }

}
