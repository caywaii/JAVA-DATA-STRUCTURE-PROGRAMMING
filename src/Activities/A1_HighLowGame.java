package Activities;
import java.util.*;
public class A1_HighLowGame {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
         int random = (int) (Math.random() * 25);
        System.out.println(random);
        System.out.println("High Low Game");

        int ctr = 0;
        while(true){
            ctr = ctr + 1;
            System.out.print("Enter Number [1-25]: ");
            int num = scan.nextInt();
            if(num > 25 || num < 0){
                System.out.println("Out of Range");
            }else if(num < random){
                System.out.println("Number is too low");
            }else if(num > random){
                System.out.println("Number is too high");
            }else{
                System.out.println("You got it right");
                break;
            }
        }
        System.out.println(ctr + "attempt(s) made");
    }
}
