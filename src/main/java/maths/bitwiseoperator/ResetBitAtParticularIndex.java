package maths.bitwiseoperator;

public class ResetBitAtParticularIndex {
    public static void main(String[] args) {
        int element = 31;
        int bitToSet = 1;

        System.out.println( resetBit(element, bitToSet));
        bitToSet = 3;
        System.out.println( resetBit(element, bitToSet));
        bitToSet = 4;
        System.out.println( resetBit(element, bitToSet));
        bitToSet = 5;
        System.out.println( resetBit(element, bitToSet));

    }

    /**
     * setBit method return integer value by setting up the value 0 at particular bit.
     * @param element
     * @param bitToSet
     * @return
     */
    private static int resetBit(int element, int bitToSet) {
        // use left shift to by bitToset -1 so that we can set the bit to particular bit.
        // for ex. element 10 in binary is 1010 and we shift 1 by bitToset -1 so mask value is  1<<2  which is 100.
        // Shifted 1 by 2 bits on left side. and now apply OR operator as OR will return 1 in each case if any of the bit is 1.
        int mask = ~(1<< bitToSet -1);
        return element & mask;
    }

}
