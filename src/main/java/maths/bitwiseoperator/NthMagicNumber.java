package maths.bitwiseoperator;

public class NthMagicNumber {

    public static void main(String[] args) {
        int number = 5;
        int base = 5;
        int answer = 0;

        while(number > 0){
            int last = number & 1;
            answer += last * base;
            base *= 5;
            number = number >> 1;
        }
        System.out.println(answer);
    }
}
