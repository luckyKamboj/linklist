package tree.binary.search;

/**
 * This class contains 2 ways of BinarySearchTree insertion.
 * First one is with recursion which has time complexity O(log n) which is basically the height of the tree and
 * in worst case the time complexity can be O(n) if it is a skew binary tree. and space complexity for the binary tree
 * is also O(log n) in general which is the height of the tree, but it can also be O(n) in case if it is a skew binary tree.
 *
 * Second Approach is with iteration which will have time complexity same as recursive approach but space complexity will
 * be constant O(1).
 */
public class BinarySearchTreeInsertion {
    public static void main(String[] args) {
        BinarySearchTreeInsertion bstInsertion = new BinarySearchTreeInsertion();
        int[] arr = {23,45,67,6,68,88,98,5,435,32,34,434,53,56,57,65,71,627};

        // first approach
        Node bst = bstInsertion.binarySearchTreeInsertionWithRecursion(arr);
        System.out.println("Proof it is a binary Search tree : ");
        bstInsertion.inOrderTraversal(bst);

        // second approach
        bst = null;
        bst = bstInsertion.binarySearchTreeInsertionWithIteration(arr);
        System.out.println("Proof it is a binary Search tree : ");
        bstInsertion.inOrderTraversal(bst);
    }

    private Node binarySearchTreeInsertionWithIteration(int[] arr) {
        Node node = null;
        for (int element : arr) {
          node = iterativeApproach(node, element);
        }
        return node;
    }

    /**
     *  Parent node reference is mandatory to hold. so that we can insert new value at parent node when the current node is null.
     * @param node
     * @param element
     * @return
     */
    private Node iterativeApproach(Node node, int element) {
        Node currentNode = node;
        Node parentNode = null;

        while(currentNode != null){
            parentNode = currentNode;
            if(currentNode.data > element){
                currentNode = currentNode.left;
            }else if(currentNode.data < element){
                currentNode = currentNode.right;
            }
        }
        if(parentNode == null){
            return new Node(element);
        }
        if(parentNode.data > element){
            parentNode.left = new Node(element);
        }else{
            parentNode.right = new Node(element);
        }

        return node;
    }

    /**
     * Is in order traversal gives a sorted array that means our binary tree is BST.
     * And if it's not that means it is a simple binary tree.
     * @param bst
     */
    private void inOrderTraversal(Node bst) {
        if(bst == null){
            return;
        }
        inOrderTraversal(bst.left);
        System.out.print(bst.data + ",");
        inOrderTraversal(bst.right);
    }

    /**
     *
     * @param arr
     * @return returns a binary search tree.
     */
    private Node binarySearchTreeInsertionWithRecursion(int[] arr) {
        Node node = null;
        for (int element: arr) {
           node = insertElement(node, element);
        }
        return node;
    }

    private Node insertElement(Node node, int element) {
        if(node == null){
            return new Node(element);
        }
        if(node.data > element){
            node.left = insertElement(node.left, element);
        }else if(node.data < element){
            node.right = insertElement(node.right, element );
        }
        return node;
    }

    private static class Node {
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }
}
