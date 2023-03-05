package LinkedList;
import java.util.*;
import java.util.LinkedList;
public class Dequeue {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int add;
        int storeCtr = 0;
        String store = "";
        LinkedList<Integer> list = new LinkedList();
        System.out.print("Number of Element(s): ");
        int len = scan.nextInt();
        String line = "-------------------------------------------------";
        System.out.println("-------------------------------------------------");
        System.out.println("              First Int First Out                ");
        System.out.println(line);
        System.out.println("[1] Enqueuing                   [3] Dequeued");
        System.out.println("[2] Resetting                   [4] Exit");
        System.out.print("Stored Element(s): " + list);
        System.out.println("");
        System.out.println(line);

        while(true){
            System.out.print("Enter Selection: ");
            int sele = scan.nextInt();

            if(sele == 1){
                System.out.print("Enter Element: ");
                add = scan.nextInt();
                if(list.size() != len){
                    list.add(add);
                }else{
                    store = store + list.get(0) + " ";
                    storeCtr++;
                    list.remove(0);
                    list.add(add);
                }
                System.out.println(line);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);

            }else if(sele == 2){
                if(list.size() != len){
                    System.out.println("Queue not yet full!");
                }else{
                    for(int i = 0; i < list.size(); i++){
                        store = store + list.get(i) + " ";
                        storeCtr++;
                    }
                    list.clear();
                    System.out.println(line);
                    System.out.println("Stored Element(s): " + list);
                    System.out.println(line);
                }
            }else if(sele == 3){
                System.out.print("Dequeued Elements: " + storeCtr);
                System.out.println();
                System.out.println(store);
                System.out.println("Stored Element(s): " + list);
                System.out.println(line);
            }else if(sele == 4){
                break;
            }else{
                System.out.println("Inavlid Input");
            }
        }

        System.out.println("End of Program");
    }
}
