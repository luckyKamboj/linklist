package leetcode;


// https://leetcode.com/problems/zigzag-conversion/submissions/
public class Question6 {

    public static void main(String[] args) {
        String str = "ABCDEF";
//        System.out.println(convert(str, 1));
//        System.out.println(convert(str, 2));
//        System.out.println(convert(str, 3));
        System.out.println(convert(str, 4));
        System.out.println(convert(str, 5));
        System.out.println(convert(str, 6));
    }

    private static String convert(String str, int numberOfRows) {
        if(str == null || str.isEmpty()){
            return str;
        }
        if(numberOfRows == 1){
            return str;
        }
        char[] chars = str.toCharArray();
        int j =0;
        int previousNumber = 0;
        int firstRowGap = (numberOfRows - 2) * 2 + 2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfRows; i++) {
            j =i;
            previousNumber = 0;
            while (j < chars.length){
                stringBuilder.append(chars[j]);
                if(i == 0 || i == numberOfRows -1){
                    j += firstRowGap;
                }else{
                    int tempNumber = firstRowGap- (2*i) ;
                    if(previousNumber != 0 && previousNumber == tempNumber){
                        int indexMove = firstRowGap - tempNumber;
                        j += indexMove;
                        previousNumber = indexMove;
                    }else{
                        j +=tempNumber;
                        previousNumber = tempNumber;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

}
