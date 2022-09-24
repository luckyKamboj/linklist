package tree.binary;

public class CreateBinaryTree {

    protected BinaryTreeNode createBinaryTree(){
        BinaryTreeNode node = new BinaryTreeNode(5);
        node.left = new BinaryTreeNode(20);
        node.left.left = new BinaryTreeNode(30);
        node.right = new BinaryTreeNode(25);
        node.right.left = new BinaryTreeNode(4);
        node.right.right = new BinaryTreeNode(65);
        node.right.right.right = new BinaryTreeNode(615);
        node.right.right.left = new BinaryTreeNode(115);
        return node;
    }
}
