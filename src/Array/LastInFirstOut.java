package Array;
import java.util.*;
public class LastInFirstOut {
    static Scanner scan = new Scanner(System.in);
    static void displayArray(int arrP[]){
        for(int i : arrP){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    static void addLast(int arrP[], int value){
        int ctr = 0;
        for(int i = 0; i < arrP.length; i++){
            if(arrP[i] == 0){
                arrP[i] = value;
                break;
            }
            ctr++;
        }
        if(ctr == arrP.length){
            for(int i = 0; i < arrP.length-1; i++) {
                arrP[i] = arrP[i+0];
        }
            arrP[arrP.length-1] = value;
        }

    }
    static void remove(int[] arrP, int input) {
        if(input >= arrP.length){
            System.out.println("Index out of Bounds");
        }else{
            for(int i = 0; i < arrP.length; i++){
                if(input == arrP.length-1){
                    arrP[input] = 0;
                }else if(arrP[input+1] == 0){ //arrP[arrP.length-1] == 0
                       arrP[input]  = 0;
                } else{
                    System.out.println("Remove Last Element");
                    break;
                }

            }

        }
    }
    static void clear(int arrP[]){
        for(int i =0; i <arrP.length; i++){
            arrP[i] = 0;
        }

    }
    static void removeLast(int arrP[]){
        for(int i =0; i < arrP.length; i++){
            arrP[arrP.length-1] = 0;
        }
    }
    public static int[] removeLen(int[] arrP, int input){
        int y = arrP.length;
        int arrN[] = new int[y-1];
        for(int i = 0; i < y-1; i++){
            if(i >= input){
                arrN[i] = arrP[i + 1];
            }else{
                arrN[i] = arrP[i];
            }

        }
        return arrN;
    }
    public static void main(String[] args){
        String line = "----------------------------------";
        System.out.print("Enter Number of Element(s): ");
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println(line);
        System.out.print("Stored Element(s): ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(line);

        while(true){
            System.out.print("Enter Selection: ");
            int sele  = scan.nextInt();

            if(sele == 1){
               //ADD LAST
                System.out.print("Enter Element: ");
                addLast(arr, scan.nextInt());
                System.out.println(line);
                System.out.print("Stored Element(s): ");
                displayArray(arr);
                System.out.println(line);
            }else if(sele == 2){
                //REMOVE SPECIFIC INDEX

                System.out.print("Enter Index to Remove: ");
                remove(arr,scan.nextInt());
                System.out.println(line);
                System.out.print("Stored Element(s): ");
                displayArray(arr);
            }else if(sele == 3){
                //REMOVE ALL INDEX
                clear(arr);
                System.out.println(line);
                System.out.print("Stored Element(s): ");
                displayArray(arr);
            }else if(sele == 4){
                removeLast(arr);
                System.out.print("Stored Element(s): ");
                displayArray(arr);
            }else if(sele == 5){
                //REMOVE INTEGER
                System.out.print("Enter Index to Remove: ");
                arr = removeLen(arr,scan.nextInt());
                System.out.println(line);
                System.out.print("Stored Element(s): ");
                displayArray(arr);
            }
            else{
                System.out.println("Invalid Input!");
            }
        }
    }
}
