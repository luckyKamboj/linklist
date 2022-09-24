package recursion.subset;

public class Subset {

    public static void main(String[] args) {
        String str = "abc";
        String processed = "";
        subset(processed, str);
    }

    private static void subset(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            if(!processed.isEmpty()){
                System.out.println(processed);
            }
            return;
        }
        char ch = unprocessed.charAt(0);
        String updatedValue = processed + ch;
        subset(updatedValue, unprocessed.substring(1) );
        subset(processed, unprocessed.substring(1) );
    }
}
