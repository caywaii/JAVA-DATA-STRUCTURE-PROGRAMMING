package Activities;
import java.util.*;
public class AI_HighestIndexInput {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        int array[] = new int[5];

        for(int i = 0; i < array.length; i++){
            System.out.print("Index["+ i +"]: ");
            array[i] = scan.nextInt();
        }

        int a = array.length-1;
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < array.length-i; j++){
                if(array[j] > array[j+1]){
                    int temp =  array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int highest = array.length-1;
        System.out.println("Highest Number is: " + array[highest]);
        System.out.println("Lowest Number is: " + array[0]);

    }
}
