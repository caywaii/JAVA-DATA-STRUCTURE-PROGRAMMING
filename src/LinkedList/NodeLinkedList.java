package LinkedList;

public class NodeLinkedList {
    Node head;
    static class Node {
        int number;
        Node next;
        Node(int x){
            number = x;
            next = null;
        }
    }

    public static void main(String[] args){
        NodeLinkedList list = new NodeLinkedList();

        //Declaring Values
        list.head = new Node(9);
        Node second = new Node (3);
        Node third = new Node (6);

        //Arranging
        list.head.next = second;
        second.next = third;

        //Printing
        while(list.head != null){
            System.out.println(list.head.number + " ");
            list.head = list.head.next;
        }

    }
}


