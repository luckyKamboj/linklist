package linklist;

import java.util.LinkedList;

public class LinkList {

    private Node head;
    private Node tail;
    private Integer size;

    public LinkList(){
        size = 0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> test= new LinkedList<>();

        LinkList ll = new LinkList();
        ll.addFirst(32);
        ll.addFirst(42);
        ll.addLast(76);
        ll.addIndex(36,3);
        ll.display();
        ll.deleteFirst();
        System.out.println("DeleteFirst");
        ll.display();
        System.out.println("DeleteLast");
        ll.deleteLast();
        ll.display();
        ll.addFirst(65);
        ll.addFirst(77);
        System.out.println("New List");
        ll.display();
        ll.deleteIndex(2);
        System.out.println("Deleted 2 index");
        ll.display();
        System.out.println("Deleted 1 index");
        ll.deleteIndex(1);
        ll.display();
        System.out.println("Deleted 1 index");
        ll.deleteIndex(1);
        ll.display();
        System.out.println("Deleted 1 index");
        ll.deleteIndex(1);
        ll.display();
        System.out.println("Deleted 1 index");
        ll.deleteIndex(1);
        ll.display();
    }

    private void deleteIndex(int index) {
        if(0 == index){
            deleteFirst();
            size--;
            return;
        }
        if(size-1 == index){
            deleteLast();
            size--;
            return;
        }
        Node node = get(index - 1);
        node.next = node.next.next;
        size--;
    }

    private void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        --size;

    }

    private void deleteLast(){
        if(size == 0){
            deleteFirst();
            size--;
            return;
        }
        tail = get(size -2);
        tail.next = null;
        size--;
    }

    public Node get(int index){
        Node temp = head;
        int i =0;
        while(i< index){
            temp = temp.next;
            i++;
        }
        return temp;
    }
    private void addIndex(int data, int index) {
        if(size < index){
            System.out.println("Out of bound exception.");
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =1;
        while(i<index){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        ++size;
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        ++size;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public Node add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
            size++;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
        return head;
    }

    public void addLast(int data){
        if(tail == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
}
