package LinkedList;
import java.util.*;
import java.util.LinkedList;

public class LastInFirstOut {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        String line = "----------------------------------";
        System.out.print("Enter Number of Element(s): ");
        int len = scan.nextInt();

        System.out.println(line);
        System.out.println("Stored Element(s): " + list);
        System.out.println(line);

        while(true){
            System.out.print("Enter Selection: ");
            int sele = scan.nextInt();
            if(sele == 1){
                //ADD LAST
                System.out.print("Enter Element: ");
                int addEle = scan.nextInt();
                if(list.size() != len){
                    list.addLast(addEle);
                }else{
                    list.set(len-1, addEle);
                }
                System.out.println(line);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);
            }else if(sele == 2){
                System.out.print("Enter Index: ");
                int idx = scan.nextInt();
                if(idx == list.size()-1){
                    list.removeLast();
                }else{
                    System.out.println("Remove Last Element");
                }
                System.out.println(line);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);
            }else if(sele == 3){
                //REMOVE ALL
                if (list.size()-1 != 0) {
                    list.clear();
                }else{
                    System.out.println("NOT FULL");
                }

                System.out.println(line);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);
            }else if(sele == 4){
                //EXIT
                break;
            }else{
                System.out.println("Invalid Input");
            }
        }
    }
}
