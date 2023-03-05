package LinkedList;
import java.util.*;
import java.util.LinkedList;
public class FirstInFirstOut {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        LinkedList <Integer> list = new LinkedList<>();
        String line = "-----------------------------------";
        System.out.print("Number of Element(s): ");
        int len = scan.nextInt();

        System.out.println(line);
        System.out.println("        First In First Out         ");
        System.out.println(line);
        System.out.println("Stored Element(s): " + list);
        System.out.println(line);

        while(true){
            System.out.print("Enter Selection: ");
            int sele = scan.nextInt();

            if(sele == 1){
                System.out.print("Enter Element: ");
                int ele = scan.nextInt();

                if(list.size() != len){
                    list.add(ele);
                }else{
                    list.remove(0);
                    list.add(ele);
                }
                System.out.println(line);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);
            }else if(sele == 2){
                list.clear();
                System.out.println(line);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);
            }else if(sele == 3){
                break;
            }else{
                System.out.println("Invalid Input!");
            }
        }
    }
}
