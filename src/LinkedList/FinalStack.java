package LinkedList;
import java.util.*;
public class FinalStack {
    static Scanner scan = new Scanner(System.in);
    static LinkedList<Integer> list = new LinkedList<>();
    static int len;
    static String line = "----------------------------";
    static int ctrSlot;
    static String store = "";
    static int ctrStore = 0;
    static void display(){
        System.out.println(line);
        System.out.println("  Stacks Operations - LIFO ");
        System.out.println(line);
        System.out.println("[1]Push [2]Pop [3]Peek [4]Popped [5]Exit");
    }

    static void determine(){
        if(list.size() == len){
            System.out.println("Stack Status: Full");
        }else if(list.isEmpty()){
            System.out.println("Stack Status: Empty");
        }else{
            if(ctrSlot == len-1){
                System.out.println("Stack Status: " + (len - ctrSlot) + " Empty Slot" );
            }else{
                System.out.println("Stack Status: " + (len - ctrSlot) + " Empty Slots" );
            }
        }
    }
  public static void main(String[] args){
        boolean loop = true;
      try{
          System.out.print("Number of Element(s): ");
          len = scan.nextInt();
      }catch(Exception e){
          System.out.println("Input Mismatch!");
          display();
          System.out.println(line);
          System.out.println("End of Program");
          System.exit(0);
      }
      display();
      determine();
      while(loop){
          System.out.println(line);
          System.out.print("Select Operation: ");
          String select = scan.next();
          scan.nextLine();

          if(select.equals(select) == select.equals("1") || select.equals("2") || select.equals("3") || select.equals("4") || select.equals("5")){
              if(select.equals("1")){
                  if(list.size() != len){
                      System.out.print("Enter Element: ");
                      int elem = scan.nextInt();
                      list.add(elem);
                      ctrSlot++;
                      determine();
                  }else if(ctrSlot == len){
                      determine();
                  }
              }else if(select.equals("2")){
                  if(list.isEmpty()){
                      System.out.println("Stack is EMPTY!");
                      determine();
                  }else{
                      System.out.println("Popped element is " + list.getLast());
                      store = store + list.getLast() + " ";
                      ctrStore++;
                      list.removeLast();
                      ctrSlot--;
                      determine();
                  }
              }else if(select.equals("3")){
                  if(list.isEmpty()){
                      System.out.println("No Element in the Stacks!");
                      determine();
                  }else{
                      System.out.println("Last Element is " + list.getLast());
                      determine();
                  }
              }else if(select.equals("4")){
                  System.out.println(ctrStore + " Popped Element(s): " + store);
                  determine();
              }else if(select.equals(("5"))){
                  break;
              }else{
                  System.out.println("Invalid Input");
              }

          }else{
              System.out.println("Invalid Selection");
              determine();
              loop = true;
          }
      }
      System.out.println(line);
      System.out.println("End of Program");
  }
}
