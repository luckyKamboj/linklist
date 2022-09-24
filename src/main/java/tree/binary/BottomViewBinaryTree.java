package tree.binary;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewBinaryTree extends CreateBinaryTree{

    public static void main(String[] args) {
       BinaryTreeNode binaryTreeNode = new BottomViewBinaryTree().createBinaryTree();
       System.out.println("Bottom View");
       bottomViewBinaryTree(binaryTreeNode);
    }

    private static void bottomViewBinaryTree(BinaryTreeNode node) {
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        int horizontalDigit = 0;
        queue.add(new Pair(horizontalDigit, node));
        while(!queue.isEmpty()){
            Pair pairs = queue.poll();
            map.put(pairs.horizontalDigit, pairs.getNext().getData());
            if(pairs.getNext().left != null){
                horizontalDigit = pairs.horizontalDigit - 1;
                queue.add(new Pair(horizontalDigit, pairs.getNext().left));
            }
            if(pairs.getNext().right != null){
                horizontalDigit = pairs.horizontalDigit + 1;
                queue.add(new Pair(horizontalDigit, pairs.getNext().right));
            }
        }

        for (Map.Entry<Integer, Integer> mapEntry: map.entrySet()) {
            System.out.println(mapEntry.getValue());
        }
    }
}
