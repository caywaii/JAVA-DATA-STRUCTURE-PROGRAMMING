package LinkedList;
import java.util.*;
import java.util.LinkedList;
public class Stack {
    static Scanner scan = new Scanner(System.in);
    static String line = "--------------------------------------";
    static int len;
    static int ctrSlot;
    static String store = "";
    static int ctrStore =0;
    static LinkedList<Integer> list = new LinkedList<>();
    static void details(){
        System.out.println(line);
        System.out.println("     Stack Operations - LIFO   ");
        System.out.println(line);
        System.out.println("[1]Push [2]Pop [3]Peek [4]Popped [5]Exit");
    }
    static <list> void determine(){
        if(list.size() == len){
            System.out.println("Full");
        }else if(list.size() == 0){
            System.out.println("Empty Slot");
        }else{
            if(len - ctrSlot > 1){
                System.out.println(len - ctrSlot +" Empty Slots");
            }else{
                System.out.println(len - ctrSlot +" Empty Slot");
            }
        }
    }
   public static void main(String[] args){
       boolean loop = true;
       try{
           System.out.print("Number of Elements: ");
           len = scan.nextInt();
       }catch(Exception e){
           System.out.println("Input Mismatch!");
           details();
           System.out.println(line);
           System.out.println("End of the Program");
           System.exit(0);
       }
       details();
       System.out.print("Stack Status: ");
       determine();
       while(loop){
           System.out.println(line);
           System.out.print("Select Operations: ");
           String select = scan.next();
           scan.nextLine();
           if(select.equals(select) == select.equals("1") || select.equals("2") || select.equals("3") || select.equals("4") || select.equals("5")){
               if(select.equals("1")){
                   if(list.size() != len){
                       System.out.print("Enter Element: ");
                       int elem = scan.nextInt();
                       list.add(elem);
                       ctrSlot++;
                       System.out.print("Stack Status: " );
                       determine();
                   }else{
                       if(ctrSlot == len){
                           System.out.print("Stack Status: ");
                           determine();
                       }
                   }
               }else if(select.equals("2")){
                   if(list.size() == 0){
                       System.out.println("Stack is EMPTY!");
                       System.out.print("Stack Status: ");
                       determine();
                   }else{
                       System.out.println("Popped element is: " + list.getLast());
                       store = store + list.getLast() + " ";
                       ctrStore++;
                       list.removeLast();
                       ctrSlot--;
                       System.out.print("Stack Status: ");
                       determine();
                   }
               }else if(select.equals("3")){
                   if(list.size() == 0){
                       System.out.println("No Element in the Stacks!");
                       System.out.print("Stack Status: ");
                       determine();
                   }else{
                       System.out.println("Last Element is " + list.peekLast());
                       System.out.print("Stack Status: ");
                       determine();
                   }
               }else if(select.equals("4")){
                   System.out.println(ctrStore + " Popped Elements(s): " + store);
                   System.out.print("Stack Status: ");
                   determine();
               }else if(select.equals("5")){
                   break;
               }
           }else{
               System.out.println("Invalid Selection");
               System.out.print("Stack Status: ");
               determine();
               loop = true;
           }
       }
       System.out.println(line);
       System.out.println("End of Program");
   }
}
