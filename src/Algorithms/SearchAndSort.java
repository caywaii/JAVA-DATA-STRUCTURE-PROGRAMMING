package Algorithms;

import java.util.Scanner;

public class SearchAndSort {
    static Scanner scan = new Scanner(System.in);

    static void displayArray(int arrP[]) {
        for (int i = 0; i < arrP.length; i++) {
            System.out.print(arrP[i] + " ");
        }
    }

    static void getArray(int arrP[]) {
        for (int i = 0; i < arrP.length; i++) {
            System.out.print("Index[" + i + "]: ");
            arrP[i] = scan.nextInt();
        }
        displayArray(arrP);
    }

    static void ascendingDescending(int arrP[], int order) {
        int a = arrP.length - 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                if (arrP[j] < arrP[j + 1] && order == 0) {
                    int temp = arrP[j];
                    arrP[j] = arrP[j + 1];
                    arrP[j + 1] = temp;
                } else if (arrP[j] > arrP[j + 1] && order == 1) ;
                int temp = arrP[j];
                arrP[j] = arrP[j + 1];
                arrP[j + 1] = temp;
            }
        }
        displayArray(arrP);
    }

    static void highestLowest(int arrP[], int type) {
        int a = arrP.length - 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                if (arrP[j] > arrP[j + 1]) {
                    int temp = arrP[j];
                    arrP[j] = arrP[j + 1];
                    arrP[j + 1] = temp;
                }
            }
        }
        if (type == 0) {
            System.out.println("Highest Value is: " + arrP[arrP.length - 1]);
        } else if (type == 1) {
            System.out.println("2nd Highest Value is: " + arrP[arrP.length - 2]);
        } else if (type == 2) {
            System.out.println("Lowest Value is: " + arrP[0]);
        } else if (type == 3) {
            System.out.println("2nd Lowest Value is: " + arrP[1]);
        }
    }

    static void determineArray(int arrP, int determine) {

    }
    static void evenOdd(int arrP[], int integer) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arrP.length; i++) {
            if (arrP[i] % 2 == 0 && integer == 0) {
                even++;
                System.out.print(arrP[i] + " ");

            }
        }
        for (int i = 0; i < arrP.length; i++) {
            if (arrP[i] % 2 != 0 && integer == 1) {
                System.out.print(arrP[i] + " ");
                odd++;
            }
        }
    }
    static void counterEvenOdd (int arrP[], int counter){
        int even = 0; int odd = 0;
        for(int i = 0; i < arrP.length; i++){
            if(arrP[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        if(counter == 0){
            System.out.println("Even: " + even);
        }else if(counter == 1){
            System.out.println("Odd: " + odd);
        }
    }
    static void counterSwapDescending(int arrP[]){
        int ctr = 0;
        int a = arrP.length-1;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a-i; j++){
                if(arrP[j] > arrP[j+1]){
                    int temp = arrP[j];
                    arrP[j] = arrP[j+1];
                    arrP[j+1] = temp;
                    ctr += 1;
                }
            }
        }
        System.out.println("Descending Order Counter Swap: " + ctr);
    }

    static void counterSwapAscending(int arrP[]) {
        int a = arrP.length - 1;
        int ctr = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                if (arrP[j] < arrP[j + 1]) {
                    int temp = arrP[j];
                    arrP[j] = arrP[j + 1];
                    arrP[j + 1] = temp;
                    ctr = ctr + 1;
                }
            }
        }
        System.out.println("Ascending Order Counter Swap: " + ctr);


    }
    static void getValue(int arrP[]){
        System.out.print("Enter Index[0-"+(arrP.length-1)+": ");
        int idx = scan.nextInt();

        System.out.println("Values: " + arrP[idx]);
    }
    static void getIndex(int arrP[]) {
        int ctr = 0;
        System.out.println("Enter Values");
        int val = scan.nextInt();

        for(int i = 0; i < arrP.length; i++){
            if(arrP[i] == val);
            System.out.println(i + " ");
            ctr++;
        }

        if(ctr > 0){
            System.out.println(ctr + " Matches Found");
            ctr = 0;
        }else{
            System.out.println("No Match Found");
        }
    }
    static void getNormalOrder(int arrP[], int arrC[]){
        for(int i = 0; i < arrP.length; i++){
            arrC[i] = arrP[i];
        }
    }

    public static void main (String[]args){
        String line = "=========================================================";
        System.out.println(line);
        System.out.println("[1]  Enter Array");
        System.out.println("[2]  Ascending Order");
        System.out.println("[3]  Descending Order");
        System.out.println("[4]  Highest Value");
        System.out.println("[5]  2nd Highest Value");
        System.out.println("[6]  Lowest Value");
        System.out.println("[7]  2nd Lowest Value");
        System.out.println("[8]  Determine Array Type");
        System.out.println("[9]  Display All Even Numbers");
        System.out.println("[10] Count Even Number");
        System.out.println("[11] Display All Odd Numbers");
        System.out.println("[12] Count Odd Number");
        System.out.println("[13] Count Number of Swaps Made");
        System.out.println("[14] Search by Index");
        System.out.println("[15] Search by Value");
        System.out.println("[16] Natural Order");
        System.out.println("[17] Close Program");
        System.out.println(line);
        int[] array = {0};
        int[] copy = {0};
        while (true) {
            System.out.println(" ");
            System.out.print("Enter Choice: ");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.print("Enter Array Length: ");
                int len = scan.nextInt();

                array = new int[len];
                copy = new int[len];
                getArray(array);
                getNormalOrder(array, copy);
            } else if (choice == 2) {
                System.out.println(line);
                System.out.println("Ascending Order");
                ascendingDescending(array, 0);
            } else if (choice == 3) {
                System.out.println(line);
                System.out.println("Descending Order");
                ascendingDescending(array, 1);
            } else if (choice == 4) {
                System.out.println(line);   // Highest Value
                highestLowest(array, 0);
            } else if (choice == 5) {
                System.out.println(line);  // 2nd Highest Value
                highestLowest(array, 1);
            } else if (choice == 6) {
                System.out.println(line); // Lowest Value
                highestLowest(array, 2);
            } else if (choice == 7) {
                System.out.println(line); // 2nd Lowest Value
                highestLowest(array, 3);
            } else if (choice == 8) {
                System.out.println(line);
                System.out.println("Determine Array");
            } else if (choice == 9) {
                System.out.println(line);
                System.out.println("Display Even Number");
                evenOdd(array, 0);
            } else if (choice == 10) {
                System.out.println(line); // Even Counter
                counterEvenOdd(array, 0);
            } else if (choice == 11) {
                System.out.println(line);
                System.out.println("Display Odd Number");
                evenOdd(array, 1);
            } else if (choice == 12) {
                System.out.println(line); // Odd Counter
                counterEvenOdd(array, 1);
            }else if(choice == 13){
                System.out.println("Counter Swap");
                counterSwapAscending(array);
                counterSwapDescending(array);
            }else if(choice == 14){
                System.out.println(line);
                System.out.println("Find Value");
                getValue(array);
            }else if(choice == 15){
                System.out.println(line);
                System.out.println("Find Index");
                getIndex(array);
            }else if(choice == 16){
                System.out.println(line);
                System.out.println("Normal Order");
                displayArray(copy);
            }
        }

    }
}
