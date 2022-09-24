package recursion.subset;

import java.util.HashSet;
import java.util.Set;

public class Combination {
    public static void main(String[] args) {
        String str = "aba";
        Set<String> exists = new HashSet<>();
        combination("", str, exists);
        for (String ele : exists) {
            System.out.println(ele);
        }
    }

    private static void combination(String processed, String unprocessed, Set<String> checkExistence) {
        if(unprocessed.isEmpty()){
            checkExistence.add(processed);
            return;
        }
        char firstIndex = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length() ; i++) {
            String firstPart = processed.substring(0, i);
            String remainingPart = processed.substring(i);
            combination(firstPart + firstIndex + remainingPart, unprocessed.substring(1),checkExistence);
        }

    }
}
