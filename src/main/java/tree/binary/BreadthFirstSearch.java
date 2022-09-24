package tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends CreateBinaryTree{

    public static void main(String[] args) {
        BreadthFirstSearch b = new BreadthFirstSearch();
        BinaryTreeNode cbTree = b.createBinaryTree();
        System.out.println("Level wise element printing with O(n**2) time complexity:");
        int heightOfTree = heightOfTree(cbTree);
        traditionalBreadthFirstElementPrinting(cbTree, heightOfTree);
        System.out.println("Optimized with O(n) time complexity:");
        optimizedBreadthFirstElementPrinting(cbTree);
        System.out.println("Print Level Wise In separate line:");
        optimizedLevelWiseBreadthFirstElementPrinting(cbTree);
    }

    private static void optimizedLevelWiseBreadthFirstElementPrinting(BinaryTreeNode cbTree) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(cbTree);
        queue.add(null);
        while (!queue.isEmpty()){
            BinaryTreeNode newNode = queue.remove();
            if(newNode == null){
                System.out.println();
                if(queue.isEmpty()) {
                    break;
                }
                queue.add(null);
                continue;
            }
            System.out.print(newNode.data + " ");
            if(newNode.left != null){
                queue.add(newNode.left);
            }
            if(newNode.right != null){
                queue.add(newNode.right);
            }
        }

    }

    private static void optimizedBreadthFirstElementPrinting(BinaryTreeNode cbTree) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(cbTree);

        while (!queue.isEmpty()){
            BinaryTreeNode newNode = queue.remove();
            System.out.println(newNode.data);
            if(newNode.left != null){
                queue.add(newNode.left);
            }
            if(newNode.right != null){
                queue.add(newNode.right);
            }
        }
    }

    private static void traditionalBreadthFirstElementPrinting(BinaryTreeNode cbTree, int heightOfTree) {
        for (int i = 1; i <= heightOfTree; i++) {
            breadthFirstElementPrinting(cbTree, i);
        }
    }

    private static void breadthFirstElementPrinting(BinaryTreeNode cbTree, int level) {
        if(cbTree == null){
            return;
        }
        if(level == 1){
            System.out.println(cbTree.data);
        }
        breadthFirstElementPrinting(cbTree.left, level-1);
        breadthFirstElementPrinting(cbTree.right, level-1);
    }

    private static int heightOfTree(BinaryTreeNode cbTree) {
        if(cbTree == null){
            return 0;
        }
        return Math.max(heightOfTree(cbTree.left), heightOfTree(cbTree.right)) + 1;
    }
}
