package Array;
import java.util.*;
public class AddReplaceRemove {
    static Scanner scan = new Scanner(System.in);
    static void displayArray(int arrP[]){
        for(int i : arrP)
            System.out.print(i + " "); //Hindi ito tinatanggap niya

    }
    static int[] add(int[] arrP, int value){
        int x = arrP.length;
        int arrN[] = new int[x+1]; //Dagdag Length //ILALAGAY SA DULO YUNG BALYU
        for(int i = 0; i < x; i++)
            arrN[i] = arrP[i];
            arrN[x] = value;
                return arrN; //walang inuwian sa baba ang ayos // kelangan niya ng uuwian na baryable
                //pokinginaaaaa!!!!!! I hate array pakiningshet // ayoko na mag IT ang bobo ko Motivation

    }

    public static int[] remove(int[] arrP, int input){
        int y = arrP.length;
        int arrN[] = new int[y-1]; //Bawas Length //BAWASS
        for(int i = 0; i < y-1; i++){ //INPUT IS LESS THAN ARRAY.LENGTH-1 - 1
            if(i >= input){
                arrN[i] = arrP[i + 1]; //YUNG VALUE IS EQUALS SA VALUE NA NAG PLUS 1
            }else{
                 arrN[i] = arrP[i];  //SASALIN MO LANG BITCH!
            }

        }
        return arrN;
   }


    public static void main(String[] args){

        String line = "------------------------------";
        System.out.println("[1] ADD");
        System.out.println("[2] REPLACE");
        System.out.println("[3] REMOVE");
        System.out.println("[4] DISPLAY");
        System.out.println("[5] EXIT");
        System.out.println(line);

        int[] arr = new int[0];
        int[] copyArr = new int[0];
        while(true) {
            System.out.println("");
            System.out.println(line);
            System.out.print("Select Transaction: ");
            int tran = scan.nextInt();

            if(tran == 1){
                System.out.print("Add Element => ");
                arr = add(arr, scan.nextInt());
            }else if(tran == 2){
                System.out.print("Replace Element: ");
                int idx = scan.nextInt();

                System.out.print("Enter New Element: ");
                arr[idx] = scan.nextInt();

            }else if(tran == 3){

                System.out.print("Enter Index: ");
                int remIdx = scan.nextInt();

                if(remIdx < 0 || remIdx >= arr.length){
                    System.out.print("Out of Bounds");
                }else {
                    arr = remove(arr, remIdx);
                }

            }else if(tran == 4){
                if(arr.length  == 0){
                    System.out.println("NO INPUT");
                }else
                    displayArray(arr);
            }else if(tran == 5){
             break;
            }else{
                System.out.println("Invalid Input");
            }

        }

    }
}
