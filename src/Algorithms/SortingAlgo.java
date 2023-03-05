package Algorithms;

public class SortingAlgo {
    public static void main(String[] args){
        int [] arr= {5,3,2,7};
        //BUBBLE SORT
        int a = arr.length - 1;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //SELECTION SORT
        for(int j = 0; j < arr.length; j++){
            int arrMin = j;
            for(int i = j+1; i < arr.length; j++){
                if(arr[i] < arr[arrMin]){
                    arrMin = i;
                }
            }
            if(arrMin != j){
                int temp = arr[j];
                arr[j] = arr[arrMin];
                arr[arrMin] = temp;
            }
        }
        for(int j =0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }

        //INSERTION SORT
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j - 1;

            }
        }
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
