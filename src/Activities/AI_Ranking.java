package Activities;
import java.util.*;
public class AI_Ranking {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        int ctr = 0;
        while(true){
            ctr = ctr + 1;
            System.out.println("Highest and Lowest");
            System.out.print("Enter 1st Number: ");
            int first = scan.nextInt();
            System.out.print("Enter 2nd Number: ");
            int second = scan.nextInt();
            System.out.print("Enter 3rd Number: ");
            int third = scan.nextInt();
            //Higher
            if (first > second && first > third){
                System.out.println("1st number is the highest: " + first);
            }else if(second > first && second > third){
                System.out.println("2nd number is the highest: " + second);
            }else {
                System.out.println("3rd number is the highest: " + third);
            }
            //Lowest
           if(first < second && first < third){
                System.out.println("1st number is the lowest: " + first);
            }else if(second < first && second < third){
                System.out.println("2nd number is the lowest: " + second);
            }else {
                System.out.println("3rd number is the lowest: " + third);
            }
            System.out.println(ctr + "Attempt(s) made");
           }

        }
    }

