package tree.binary;

public class EvenOddNodesDifference extends CreateBinaryTree{

    public static void main(String[] args) {
        EvenOddNodesDifference ev =new EvenOddNodesDifference();
        BinaryTreeNode binaryTreeNode = ev.createBinaryTree();
        System.out.println(evenOddNodeDifference(binaryTreeNode));
    }

    private static int evenOddNodeDifference(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null){
            return 0;
        }
        return binaryTreeNode.data - evenOddNodeDifference(binaryTreeNode.left) - evenOddNodeDifference(binaryTreeNode.right);
    }
}
