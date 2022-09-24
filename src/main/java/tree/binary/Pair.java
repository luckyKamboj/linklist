package tree.binary;

public class Pair {
    int horizontalDigit;
    BinaryTreeNode next;

    public Pair(int horizontalDigit, BinaryTreeNode next) {
        this.horizontalDigit = horizontalDigit;
        this.next = next;
    }

    public int getHorizontalDigit() {
        return horizontalDigit;
    }

    public void setHorizontalDigit(int horizontalDigit) {
        this.horizontalDigit = horizontalDigit;
    }

    public BinaryTreeNode getNext() {
        return next;
    }

    public void setNext(BinaryTreeNode next) {
        this.next = next;
    }
}
