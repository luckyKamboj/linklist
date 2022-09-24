package tree.binary;

public class DepthFirstSearch extends CreateBinaryTree{
    public static void main(String[] args) {
        DepthFirstSearch p = new DepthFirstSearch();

        System.out.print( " Pre Order : " );
        preOrder(p.createBinaryTree());
        System.out.println();
        System.out.print( " Post Order : " );
        postOrder(p.createBinaryTree());
        System.out.println();
        System.out.print( " In Order : " );
        inOrder(p.createBinaryTree());
    }

    private static void preOrder(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null){
            return;
        }
        System.out.print(binaryTreeNode.data + ",");
        preOrder(binaryTreeNode.left);
        preOrder(binaryTreeNode.right);
    }

    private static void postOrder(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null){
            return;
        }
        postOrder(binaryTreeNode.left);
        postOrder(binaryTreeNode.right);
        System.out.print(binaryTreeNode.data + ",");
    }

    private static void inOrder(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null){
            return;
        }
        inOrder(binaryTreeNode.left);
        System.out.print(binaryTreeNode.data + ",");
        inOrder(binaryTreeNode.right);
    }

}
