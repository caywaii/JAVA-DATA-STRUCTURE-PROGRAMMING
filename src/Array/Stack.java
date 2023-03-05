package Array;
import java.util.*;
public class Stack {
    static Scanner scan = new Scanner(System.in);
    static String line = "-----------------------------------";
    static int len;
    static int ctrSlot;

    static String store ="";
    static int ctrStore;
    static void display(){
        System.out.println(line);
        System.out.println("    Stacks Operations - LIFO    ");
        System.out.println(line);
        System.out.println("[1]Push [2]Pop [3]Peek [4]Popped [5]Exit");
    }
    static void determine(int[] arrP){
        if(ctrSlot == 0){
            System.out.println("Stack Status: Empty");
        }else if(ctrSlot == len){
            System.out.println("Stack Status: Full");
        }else {
            if(ctrSlot == len-1){
                System.out.println("Stack Status: " + (len-ctrSlot) + " Empty Slot");
            }else{
                System.out.println("Stack Status: " + (len-ctrSlot) + " Empty Slots");
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
        int array[] = new int[len];
        display();
        while(loop){
            System.out.println(line);
            System.out.print("Select Operation: ");
            String select = scan.next();
            scan.nextLine();
            if(select.equals(select) == select.equals("1") || select.equals("2") || select.equals("3") || select.equals("4") || select.equals("5")){
                if(select.equals("1")){
                    if(ctrSlot != len){
                        System.out.print("Enter Element: ");
                        int elem = scan.nextInt();
                            array[ctrSlot] = elem;
                            ctrSlot++;
                            determine(array);
                    }else if(ctrSlot == len){
                        determine(array);
                    }
                }else if(select.equals("2")){
                    if(ctrSlot == 0){
                        System.out.println("Stack is EMPTY!");
                        determine(array);
                    }else{
                        System.out.println("Popped element is " + array[ctrSlot-1]);
                        store = store + array[ctrSlot-1] + " ";
                        ctrStore++;
                        ctrSlot--;
                        determine(array);
                    }
                }else if(select.equals("3")){
                    if(ctrSlot == 0){
                        System.out.println("No Element in the Stacks!");
                        determine(array);
                    }else{
                        System.out.println("Last Element is " + array[ctrSlot-1]);
                        determine(array);
                    }
                }else if(select.equals("4")){
                    System.out.println(ctrStore + " Popped Element(s):  " + store);
                    determine(array);
                }else if(select.equals("5")){
                    break;
                }

            }else{
                System.out.println("Invalid Selection");
                determine(array);
                loop = true;
            }
        }
        System.out.println(line);
        System.out.println("End of Program");
    }
}
