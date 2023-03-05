package Activities;
import java.util.*;
public class A1_EvenOdd {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        System.out.print("Array Length: ");
        int len = scan.nextInt();
        int array[] = new int[len];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Index [" + i + "]: ");
            array[i] = scan.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
                System.out.print(array[i] + " ");
            }
        }
            System.out.println("");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    odd++;
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println("");
            System.out.println("Even: " + even);
            System.out.println("Odd: " + odd);
        }
    }


