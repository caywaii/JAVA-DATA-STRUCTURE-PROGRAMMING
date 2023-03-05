package LinkedList;
import java.util.LinkedList;
import java.util.*;
public class InputAddReplaceRemove {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        LinkedList <Integer> list = new LinkedList<>();
        String line = "-----------------------";
        System.out.print("Length: ");
        int len = scan.nextInt();

        for(int i = 0 ; i < len; i++){
            System.out.print("Index["+i+"]: ");
            list.add(i , scan.nextInt());
        }
        System.out.println(line);
        System.out.println(list);

        while(true){
            System.out.print("Select Transaction: ");
            int tran = scan.nextInt();

            if(tran == 1){
                System.out.print("Add Element => ");
                int add = scan.nextInt();
                list.add(add);

            }else if(tran == 2){
                System.out.print("Replace Element => ");
                int replace = scan.nextInt();

                System.out.print("Add New Element =>");
                int newEle = scan.nextInt();
                list.set(replace, newEle);
            }else if(tran == 3){
                System.out.print("Remove Element => ");
                int remove = scan.nextInt();
                list.remove(remove);
            }else if(tran == 4){
                System.out.println(list);
            }else if(tran == 5){
                break;
            }

        }
        System.out.println("End of Program");
    }
}
