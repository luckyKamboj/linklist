package recursion.subset;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);
    }

    private static void permutation(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String firstPart = processed.substring(0,i);
            String endPart = processed.substring(i);
            String newProcessed = firstPart + ch + endPart;
            permutation(newProcessed, unprocessed.substring(1));
        }
    }
}
