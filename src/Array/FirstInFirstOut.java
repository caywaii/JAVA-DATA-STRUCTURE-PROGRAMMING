package Array;
import java.util.*;
public class FirstInFirstOut {
    static Scanner scan = new Scanner(System.in);

    static void displayArray(int arrP[]){
        for(int i: arrP){
            System.out.print(i + " ");
        }
    }

    static void addArray(int arrP[], int element){
        int ctr = 0;
        for(int i = 0; i < arrP.length; i++){
            if(arrP[i] == 0){
                arrP[i] = element;
                break;
            }
            ctr++;
        }
        if(ctr == arrP.length){
            for(int i = 0; i < arrP.length - 1; i++){
                arrP[i] = arrP[i+1];
            }
            arrP[arrP.length -1] = element;
        }
    }
    static void clearArray(int arrP[]){
        //Equals to 0 then Print
        int ctr = 0;
        for(int i = 0; i < arrP.length; i++){
            if(arrP[i] != 0){
                ctr++;
            }
        }
        if(ctr == arrP.length){
            for(int i = 0; i < arrP.length; i++){
                arrP[i] = 0;
            }
        }else{
            System.out.println("NOT FULL");
        }

        displayArray(arrP);
    }

    public static void main(String[] args){
        String line = "-----------------------------------";
        System.out.print("Number of Element(s): ");
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println(line);
        System.out.println("        First In First Out         ");
        System.out.println(line);
        System.out.print("Stored Element(s): " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //KAIN MUNA AKO//! >-<wait
        System.out.println(line);

        while(true){
            System.out.print("Enter Selection: ");
            int sele = scan.nextInt();

            if(sele == 1){
                System.out.print("Enter Element: ");
                addArray(arr, scan.nextInt());
                System.out.println(line);
                System.out.print("Stored Element(s): " );
                displayArray(arr);
                System.out.println("");
                System.out.println(line);
            }else if(sele == 2){
                clearArray(arr);
            }else if(sele == 3){
                break;
            }else{
                System.out.println("Invalid Input!");
            }
        }
    }
}
