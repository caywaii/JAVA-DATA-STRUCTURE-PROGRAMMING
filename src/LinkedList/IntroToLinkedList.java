package LinkedList;
import java.util.LinkedList;
public class IntroToLinkedList {
    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<>();
        //Object /Method /Argument
        ///////
        myList.addLast("Sam"); //1
        myList.addLast("Espino"); //2
        myList.addLast("ITE201"); //3
        myList.addFirst("ITE203"); //0
        myList.remove(3);
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
        //////
        myList.add(0, "First"); //1
        myList.add(1, "Second");// 2
        myList.add(2, "Third");//3
        myList.add(0, "Forth");//0
        System.out.println(myList);
        System.out.println(myList.size()); //length
        System.out.println(myList.contains("Third")); //
        System.out.println(myList.indexOf("Third"));

    }
}
