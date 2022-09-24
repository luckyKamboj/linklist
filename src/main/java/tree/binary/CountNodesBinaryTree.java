package tree.binary;

public class CountNodesBinaryTree extends  CreateBinaryTree {

    public static void main(String[] args) {
        CountNodesBinaryTree cb = new CountNodesBinaryTree();
        BinaryTreeNode bs  = cb.createBinaryTree();
        System.out.println(countNodes(bs));
    }

    private static int countNodes(BinaryTreeNode bs) {
        if(bs == null){
            return 0;
        }
        return 1 + countNodes(bs.left) + countNodes(bs.right);
    }
}
