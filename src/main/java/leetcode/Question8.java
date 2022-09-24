package leetcode;

public class Question8 {

    public static void main(String[] args) {
        String str = "-12345hgESFSgzs";
        System.out.println(myAtoi(str));
        str = "2345hgESFSgzs";
        System.out.println(myAtoi(str));
        str = "    -255345hgESFSgzs";
        System.out.println(myAtoi(str));
        str = "  255345888888hgESFSgzs";
        System.out.println(myAtoi(str));
        str = "+-12";
        System.out.println(myAtoi(str));
        str = "00000-42a1234";
        System.out.println(myAtoi(str));
        str = "   +0 123";
        System.out.println(myAtoi(str));
    }

    private static int myAtoi(String str) {
        str = str.trim();
        boolean negative = false;
        boolean positive = false;
        boolean digitStart = false;
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '+'){
                if(value != 0 || positive || negative || digitStart){
                    break;
                }
                positive = true;
                continue;
            }
            if(str.charAt(i) == '-'){
                if(value != 0 || positive || negative || digitStart){
                    break;
                }
                negative = true;
                continue;
            }
            if( ( (int)str.charAt(i) >= (int)'0') && ((int)str.charAt(i) <= (int)'9')){
                digitStart = true;
                int number = Integer.parseInt("" + str.charAt(i));
                if(value > Integer.MAX_VALUE/10 || (value == Integer.MAX_VALUE/10 && number > 7)){
                    return Integer.MAX_VALUE;
                }
                if(negative){
                    if(-value < Integer.MIN_VALUE/10 || (-value == Integer.MIN_VALUE/10 && number < -8)){
                        return Integer.MIN_VALUE;
                    }
                }
                value = value * 10 + number;
            }else{
                break;
            }
        }

        return negative ? value * -1 : value;
    }
}
