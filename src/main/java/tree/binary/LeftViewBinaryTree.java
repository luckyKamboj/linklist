package tree.binary;

import java.util.Arrays;

public class LeftViewBinaryTree extends CreateBinaryTree{

    public static void main(String[] args) {
       BinaryTreeNode node = new BinaryTreeHeight().createBinaryTree();
        int height = calculateHeight(node);
        Integer[] left = new Integer[height];
        Integer[] right = new Integer[height];
        System.out.println(Arrays.toString(leftViewBinaryTree(node, left)));
        System.out.println(Arrays.toString(rightViewBinaryTree(node, right)));
    }

    private static int calculateHeight(BinaryTreeNode node) {
        return node != null ? Math.max(calculateHeight(node.left), calculateHeight(node.right)) + 1 : 0;
    }

    private static Integer[] rightViewBinaryTree(BinaryTreeNode binaryTree, Integer[] arrayList) {
        binaryTreeRightViewUtil(binaryTree,arrayList, 0 );
        return arrayList;
    }

    private static void binaryTreeRightViewUtil(BinaryTreeNode binaryTree, Integer[] arrayList, int level) {
        if(binaryTree == null){
            return;
        }
        if(arrayList[level]  == null){
            arrayList[level] = binaryTree.data;
        }
        binaryTreeRightViewUtil(binaryTree.right, arrayList, level+1);
        binaryTreeRightViewUtil(binaryTree.left, arrayList, level+1);
    }

    private static Integer[] leftViewBinaryTree(BinaryTreeNode binaryTree,Integer[] arraylist) {
        binaryTreeLeftViewUtil(binaryTree, arraylist, 0);
        return  arraylist;
    }

    private static void binaryTreeLeftViewUtil(BinaryTreeNode binaryTree, Integer[] arraylist, int level) {

        if(binaryTree == null){
            return;
        }
        if(arraylist[level] == null){
            arraylist[level] = binaryTree.data;
        }
        binaryTreeLeftViewUtil(binaryTree.left, arraylist, level+1);
        binaryTreeLeftViewUtil(binaryTree.right, arraylist, level+1);
    }

}
