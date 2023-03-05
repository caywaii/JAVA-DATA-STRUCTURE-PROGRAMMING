package Practice;
import java.util.*;
public class MidtermExam {
    static Scanner scan = new Scanner(System.in);
    static void displayArray(int arrP[]){
        for(int i = 0; i< arrP.length; i++){
            System.out.print(arrP[i] + " ");
        }
    }
    static void getElements(int arrP[]){
        for(int i =0; i < arrP.length; i++){
            System.out.print("Index["+i+"]: ");
            arrP[i] = scan.nextInt();
        }
        displayArray(arrP);
    }

    static void sortingAlgo(int arrP[], int order){
        int a = arrP.length-1;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a-i; j++){
                if(arrP[j] > arrP[j+1] && order == 0){
                    int temp = arrP[j];
                    arrP[j] = arrP[j+1];
                    arrP[j+1] = temp;
                }else if(arrP[j] < arrP[j+1] && order == 1){
                    int temp = arrP[j];
                    arrP[j] = arrP[j+1];
                    arrP[j+1] = temp;
                }
            }
        }

        displayArray(arrP);
    }
    static void determineArray(int arrP[]){
        int ascending = 0;
        int descending = 0;
        int equals = 0;
        for(int i = 0; i < arrP.length-1; i++){
            if(arrP[i] > arrP[i + 1]){
                descending++;
            } if(arrP[i] < arrP[i + 1]){
                ascending++;
            } if(arrP[i] == arrP[i + 1]){
                equals++;
            }
        }
        if(ascending == arrP.length-1){
            System.out.println("Ascending");
        }else if(descending == arrP.length-1){
            System.out.println("Descending");
        }else if(equals == arrP.length-1){
            System.out.println("Equals");
        }else{
            System.out.println("Random");
        }
    }

    static void searchIndex(int arrP[]){
        System.out.print("Enter Index [0-" + (arrP.length-1) + "]: ");
        int input = scan.nextInt();

        while(true){
            if(input < 0 || input > arrP.length){
                System.out.println("Out of Bounds");
            }else{
                System.out.println(arrP[input] + " ");
                break;
            }
        }
    }

    static void searchValue(int arrP[]) {
        int ctr = 0;
        System.out.print("Enter Values: ");
        int val = scan.nextInt();

        for(int i =0; i < arrP.length; i++){
            if(arrP[i] == val){
                System.out.println(i + " ");
                ctr++;

            }
        }

        if(ctr > 0){
            System.out.println("");
            System.out.println(ctr + "Matches Found");
        }else{
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args){
        int array[] = {0};
        String line = "================================================";
        while(true){
            System.out.println("");
            System.out.print("Select Transaction: ");
            int tran = scan.nextInt();

            if(tran == 1){
                System.out.print("Get Length: ");
                int len = scan.nextInt();

                array = new int [len];
                getElements(array);
            }else if(tran == 2){
                System.out.println("Ascending: ");
                sortingAlgo(array, 0);
            }else if(tran == 3){
                System.out.println("Descending");
                sortingAlgo(array, 1);
            }else if(tran == 4){
                System.out.println("Determine Array");
                determineArray(array);
            }else if(tran == 5){
                searchIndex(array);
            }else if(tran==6){
                searchValue(array);
            }
        }
    }
}
