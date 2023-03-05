package Node;

public class CaseStudy {

    public static void main(String[] args){
        var n1 = new Node(6);
        var n2 = new Node(3);
        var n3 = new Node(4);
        var n4 = new Node(2);
        var n5 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println("Length is: (should print 5)");
        System.out.println(countNodes(n1));
    }
    static int countNodes(Node head){
        int count = 1;
        Node current = head;
        while(current.next != null){
            current = current.next;
            count += 1;
        }
        return count;
    }
}
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
