package maths.bitwiseoperator;

public class FindRightMostBit {

    public static void main(String[] args) {
        int element = 40;
        System.out.println(rightMostBit(element));
    }

    private static int rightMostBit(int element) {

        return element & -element;
    }
}
