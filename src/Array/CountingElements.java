package Array;
import java.sql.SQLOutput;
import java.util.*;
public class CountingElements {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter Number of Arrays: ");
        int len= scan.nextInt();

        //Declare Array
        int[] array = new int[len];
        System.out.println("--------------------------------------");
        System.out.println("        Select Action to Execute      ");
        System.out.println("--------------------------------------");
        System.out.println("[1] Fill Elements");
        System.out.println("[2] Display Elements");
        System.out.println("[3] Count the Element >= 50");
        System.out.println("[4] Display the Element < 30");
        System.out.println("[5] Exit");
        System.out.println("--------------------------------------");
        while(true){
            System.out.println(" ");
            System.out.print("Enter Selection: ");
            int sele = scan.nextInt();

            if(sele == 1){
                for(int i =0; i < array.length; i++){
                    System.out.print("Array Element ["+i+"]: ");
                    array[i] = scan.nextInt();
                }
            }else if(sele == 2){
                System.out.print(">Array Values: ");
                for(int i : array){
                    System.out.print(i + " ");
                }
                System.out.println(" ");
            }else if(sele == 3){
                int ctr = 0;
                System.out.print(">Number of Elements >= 50 is ");
                for(int i = 0; i < array.length; i++){
                    if(array[i] >= 50){
                       ctr++;
                    }
                }
                System.out.print(ctr);
                System.out.println(" ");
            }else if(sele == 4){
                System.out.print(">Number < 30 is: ");
                for(int i =0; i < array.length; i++){
                    if(array[i] < 30){
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println(" ");
            }else if(sele == 5){
                break;
            }else{
                System.out.println("Invalid Selection!");
            }

        }
    }
}
