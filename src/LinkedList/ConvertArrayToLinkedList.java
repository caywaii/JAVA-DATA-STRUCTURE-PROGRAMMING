package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
public class ConvertArrayToLinkedList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] caryl){
        LinkedList<Integer> list = new LinkedList<>();
        int len;
        String line = "------------------------------";
        System.out.println(line);
        System.out.println("  Array to Linked-List");
        System.out.println(line);

        System.out.print("Length: ");
        len = scan.nextInt();

        for(int i = 0; i < len; i++){
            System.out.print("Index ["+i+"]: ");
            list.add(i, scan.nextInt());
        }

        System.out.println(line);
        System.out.println("[1] Display Elements");
        System.out.println("[2] Display Index");
        System.out.println("[3] Exit");

        while(true){
            System.out.print("Select Transaction: ");
            int tran = scan.nextInt();

            if(tran == 1){
                System.out.println("Display Elements");
                System.out.println(list);
            }else if(tran == 2){
                System.out.println("Display Index");
                while(true){
                    System.out.print("Enter Index[0-" + (len-1) + "]: ");
                    int idx = scan.nextInt();

                    if(idx < 0 || idx >= len){
                        System.out.println("The value is out of index range.");
                    }else{
                        System.out.println("The value is " + list.get(idx));
                        break;
                    }
                }
            }else if(tran == 3){
                break;
            }else{
                System.out.println("Invalid Selection");
            }
        }
        System.out.println("End of Program");
    }
}
