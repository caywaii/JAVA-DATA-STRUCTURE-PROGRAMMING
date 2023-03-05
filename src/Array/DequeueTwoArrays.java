package Array;

import java.util.*;
public class DequeueTwoArrays {

    static Scanner scan = new Scanner(System.in);

    static int len, ctr,store;
   static String removed = "";
   static int removedInt[] = new int[20];
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
    static void addArray(int arrP[], int ele){
        if(ctr >= arrP.length){
            removedInt[store] = arrP[0];
            store++;
            for(int i = 0; i < arrP.length-1; i++){
                arrP[i] = arrP[i+1];
            }
            arrP[arrP.length-1] = ele;
        }else{
            arrP[ctr] = ele;
            ctr++;
        }
    }

    static void displayRemoved(int removedInt[]){
        System.out.print("Dequeued Elements: ");
        System.out.print(store);
        System.out.println();
        for(int i =0 ; i < store; i++){
            System.out.print(removedInt[i] + " " );
        }
        System.out.println("");
    }

    static void clearArray(int arrP[]){

        if(ctr >= arrP.length){
            for(int i =0; i < arrP.length; i++){
                removedInt[store] = arrP[i];
                store++;
            }
            for(int i =0; i< arrP.length; i++){
                arrP[i] = 0;
            }
        }else{
            System.out.println("Queue Not Yet Full!");
        }

    }
    static void dequeueing(int arrP[]){
        System.out.println(removed);
    }
    public static void main(String[] args){
        System.out.print("Number of Element(s): ");
         len = scan.nextInt();
        int arr[] = new int[len];
        displayArray(arr);

        System.out.println("[1] Add [2] Clear [3] Dequeue [4] Exit");
        System.out.println(line);

        while(true){
            System.out.print("Select Transaction: ");
            int tran = scan.nextInt();

            if(tran == 1){
                System.out.print("Enter Element: ");
                addArray(arr, scan.nextInt());
                displayArray(arr);
            }else if(tran ==2){
                clearArray(arr);
                displayArray(arr);
            }else if(tran ==3){
               displayRemoved(removedInt);
            }
        }

    }
}
