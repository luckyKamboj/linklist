package maths.bitwiseoperator;

public class FindUniqueElement {

    public static void main(String[] args) {
        int[] arr = {3,5,6,7,4,3,4,6,5};
        System.out.println(findUnique(arr));
    }

    /**
     * Using Conclusion 2 and 3rd of XOR operator. check the txt file attached in the package.
     *  by conclusion 2 adding same element in A will make all bits 0. therefore, adding 3 from index 0 and 3 from index 5 from the above example will
     *  make all the bits 0 and similarly 5 from index 1 and 5 from index 8 will make all bits 0 and same for 6 and 4 as well but as 7 is unique in the array
     *  therefore adding 0 in 7 will return 7 itself by XOR operator 3rd conclusion.
     * @param elements
     * @return
     */
    private static int findUnique(int[] elements) {
        int uniqueElement =0;
        for (int element: elements) {
            uniqueElement ^= element;
        }
        return uniqueElement;
    }
}
