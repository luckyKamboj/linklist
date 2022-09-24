package tree.binary;

public class NumberOfLeafNodes extends CreateBinaryTree{
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = new NumberOfLeafNodes().createBinaryTree();
        System.out.println(numberOfLeafNodes(binaryTreeNode));
    }

    private static int numberOfLeafNodes(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null){
            return 0;
        }
        if(binaryTreeNode.left == null && binaryTreeNode.right == null){
            return 1;
        }

        return numberOfLeafNodes(binaryTreeNode.left) + numberOfLeafNodes(binaryTreeNode.right);
    }
}
