package tree.binary;

public class BinaryTreeHeight extends CreateBinaryTree{
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = new BinaryTreeHeight().createBinaryTree();

        System.out.println(binaryTreeHeight(binaryTreeNode));
    }
    private static int binaryTreeHeight(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null){
            return 0;
        }
        return Math.max(binaryTreeHeight(binaryTreeNode.left),binaryTreeHeight(binaryTreeNode.right)) + 1;
    }
}
