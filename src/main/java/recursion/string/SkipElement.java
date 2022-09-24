package recursion.string;

public class SkipElement {

    public static void main(String[] args) {
        String element = "testAppleGet";
        String skipElement = "t";
        StringBuilder answer = new StringBuilder();
        System.out.println(skipElement(element, skipElement, answer).toString());
    }

    private static StringBuilder skipElement(String element, String skipElement, StringBuilder stringBuilder) {
        if(element.isEmpty()){
            return stringBuilder;
        }
        if(element.startsWith(skipElement)) {
            return skipElement(element.substring(1),skipElement,stringBuilder);
        }
        stringBuilder.append(element.charAt(0));
        return skipElement(element.substring(1),skipElement, stringBuilder);
    }
}
