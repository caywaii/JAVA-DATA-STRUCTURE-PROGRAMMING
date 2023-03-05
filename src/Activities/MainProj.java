package Activities;

import java.util.Scanner;

public class MainProj {
    private static Scanner scanner = new Scanner(System.in);
    private static CartList cartList = new CartList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        // Runs the cart
        while (!quit) {
            System.out.println("==============================");
            System.out.print("Enter the number you want to select in SHOPPING CART OPTIONS: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("==============================");

            switch (choice) {

                // prints options
                case 0:
                    printInstructions();
                    break;

                // prints grocery list
                case 1:
                    additem();
                    break;

                // allows the user to input and add a new item in the list
                case 2:
                    cartList.printCartList();
                    break;

                // allows the user to edit an item in the list
                case 3:
                    cartList.printCartList();
                    modifyitem();
                    break;

                // allows the user to remove an item in the list
                case 4:
                    cartList.printCartList();
                    removeItem();
                    break;

                // allows the user to search for an item in the list if it exists or not
                case 5:
                    searchItem();
                    break;

                // terminates the program
                case 6:
                    exitCart();
                    quit = true;
                    break;

            }
        }

    }

    public static void printInstructions() {
        String Apparel = ("\n || T-shirt \t\t|| Sando \n || Black shoes \t|| Running Shoes \n || Walking Shoes \t|| Shoulder bag \n || Sling Bag \t\t|| Backpack \n || skirt \t\t|| Necklace \n || Bracelet \t\t|| Ring ");
        System.out.print("\t SHOP NOW (Category: APPAREL) \n");
        System.out.print(Apparel);
        System.out.println("\n ==============================");
        System.out.print("\t SHOPPING CART OPTIONS");

        System.out.println("\n Press");
        System.out.println("\t 0 - Print the choice options");
        System.out.println("\t 1 - Add an item in your Cart");
        System.out.println("\t 2 - Print your Shopping Cart List");
        System.out.println("\t 3 - Change an item in your Cart");
        System.out.println("\t 4 - Remove an item from your Cart");
        System.out.println("\t 5 - Search for an item in your Cart");
        System.out.println("\t 6 - Quit the application");

    }

    public static void additem() {
        System.out.print("Enter the item you want to add in your Cart: ");
        cartList.addCartItem(scanner.nextLine());
    }

    public static void modifyitem() {
        System.out.println("==============================");
        System.out.print("Enter the number of the item you want to be replace: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("==============================");

        System.out.print("Enter the name of the item you want to exchange: ");
        String newItem = scanner.nextLine();
        cartList.modifyCartList(itemNo - 1, newItem);

    }

    public static void removeItem() {
        System.out.println("==============================");
        System.out.print("Enter the number of the item you want to remove: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        cartList.removeCartItem(itemNo - 1);

    }

    public static void searchItem() {
        System.out.print("Enter the name of the item you want to search in your Cart: ");
        String searchItem = scanner.nextLine();
        System.out.println("==============================");

        if (cartList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in your Shopping Cart list");
        } else {
            System.out.println(searchItem + " is not in your Shopping Cart list");
        }

    }

    public static void exitCart() {
        System.out.println("Thank you! See you next time!");
        System.out.println("Exiting . . .");
    }
}
