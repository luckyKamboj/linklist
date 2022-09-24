package leetcode;

// https://leetcode.com/problems/add-two-numbers/
public class Question2 {
    ListNode head;
    ListNode tail;
    int index = -1;
    public static void main(String[] args) {
       Question2 firstList = insertValues();
        Question2 secondList = insertValues1();
        display(firstList);
        display(secondList);
        System.out.println(firstList.index);
        System.out.println(secondList.index);
        System.out.println("Second");
        display(firstList);
        display(secondList);
        System.out.println(firstList.index);
        System.out.println(secondList.index);
        Question2 outer ;
        Question2 inner ;
        Question2 answer = new Question2();
        if(firstList.index < secondList.index){
            outer = secondList;
            inner = firstList;
        }else{
            outer = firstList;
            inner = secondList;
        }

        int i =0;
        int j =0;
        ListNode outerNode = outer.head;
        ListNode innerNode = inner.head;
        boolean isCarrier = false;
        while (i <= outer.index) {
            int first = outerNode.val;
            int second = 0;
            if(j <= inner.index) {
                second = innerNode.val;
            }
            int value;
            if(isCarrier){
                value = first + second +1;
            }else{
                value = first + second;
            }
            if(value > 9){
                value = value%10;
                isCarrier = true;
            }else{
                isCarrier = false;
            }
            answer.insert(value);
            if(j<= inner.index){
                innerNode = innerNode.next;
                j++;
            }
            outerNode = outerNode.next;
            i++;
        }
        if(isCarrier){
            answer.insert(1);
        }
        display(answer);
    }

    private static void display(Question2 answer) {
        ListNode element = answer.head;
        while(element != null){
            System.out.print(element.val);
            element = element.next;
        }
        System.out.println();
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    private void insert(int data) {
        if(head == null){
            insertFirst(data);
            return;
        }
        ListNode newNode = new ListNode(data);
        tail.next = newNode;
        tail = newNode;
        index++;

    }

    private void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        index++;
    }

    private static Question2 insertValues() {
        Question2 listNode = new Question2();
        listNode.insert(7);
        listNode.insert(8);
        listNode.insert(9);
        listNode.insert(6);
        listNode.insert(7);
        listNode.insert(5);
        return listNode;
    }


    private static Question2 insertValues1() {
        Question2 listNode = new Question2();
        listNode.insert(6);
        listNode.insert(9);
        listNode.insert(8);
        return listNode;
    }


}
