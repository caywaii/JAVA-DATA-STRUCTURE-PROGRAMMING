package Array;
import java.util.*;
public class DequeueConcat {
    static Scanner scan = new Scanner(System.in);
    static String store = "";
    static int storeCtr;
    static int len;
    static int size = 0;
    static String line = "-----------------------------------------------------";
    static void displayArray(int arrP[]){
        System.out.println(line);
        System.out.print("Store Element(s): ");
        for(int i = 0; i <arrP.length; i++){
            System.out.print( arrP[i] + " ");
        }
        System.out.println("");
        System.out.println(line);
    }

    static void addArray(int arrP[], int value){
        if(size < len){
            for(int i = 0; i < arrP.length; i++) {
                arrP[size] = value;
                size++;
                break;
            }
        }else{
            store = store + arrP[0] + " "; //Concatenation
            storeCtr++;
            for(int i = 0; i < arrP.length-1; i++){
                arrP[i] = arrP[i+1]; //MOVE BY 1
            }
            arrP[size-1] = value;
        }

       }
    static void clearArray(int arrP[]){
        if(size != arrP.length){
            System.out.println("Queue not yet full!");
        }else {
            for(int i =0; i < arrP.length; i++){
                store = store + arrP[i] + " ";
                storeCtr++;
            }
            for(int i = 0; i < arrP.length; i++){
                arrP[i] = 0;
            }
        }
    }
    static void deletedArray(int arrP[]){
        System.out.println(store);
    }
    public static void main(String[] args){
        System.out.print("Number of Element(s): ");
        len = scan.nextInt();
        int arr [] = new int[len];
        System.out.println("-------------------------------------------------");
        System.out.println("              First Int First Out                ");
        System.out.println(line);
        System.out.println("[1] Enqueuing                   [3] Dequeued");
        System.out.println("[2] Resetting                   [4] Exit");
        System.out.print("Stored Element(s): ");
        for(int i =0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(line);

        while(true){
            System.out.print("Enter Selection: ");
            int sele = scan.nextInt();
            if(sele == 1){
                System.out.print("Enter Element: ");
                addArray(arr, scan.nextInt());
                displayArray(arr);
            }else if(sele == 2){
                clearArray(arr);
                displayArray(arr);
            }else if(sele == 3){
                System.out.print("Number of Dequeue: " + storeCtr);
                System.out.println("");
                deletedArray(arr);
                System.out.print("Stored Element(s): ");
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
                System.out.println(line);
            }else if(sele == 4){
                break;
            }else{
                System.out.println("Invalid Input");
            }
        }
        System.out.println("End of Program");
    }
}
