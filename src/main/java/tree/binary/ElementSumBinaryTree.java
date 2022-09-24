package tree.binary;

public class ElementSumBinaryTree extends CreateBinaryTree{
    public static void main(String[] args) {
        ElementSumBinaryTree b = new ElementSumBinaryTree();
        BinaryTreeNode cbTree = b.createBinaryTree();
        System.out.println(sumOfElements(cbTree));

    }

    private static int sumOfElements(BinaryTreeNode cbTree) {
        if (cbTree == null){
            return 0;
        }
        return cbTree.data + sumOfElements(cbTree.left) + sumOfElements(cbTree.right);
    }
}
