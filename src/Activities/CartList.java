package Activities;

import java.util.LinkedList;

public class CartList {
    private LinkedList<String> CartList = new LinkedList<>();

    public void addCartItem(String item) {
        CartList.add(item);
        System.out.println("==============================");
        System.out.println("Added " + item + " to the list");

    }

    public void printCartList() {
        System.out.println("You have " + CartList.size() + " items in your Cart");
//        for (int i = 0; i < CartList.size(); i++) {
//            System.out.println((i + 1) + ". " + CartList.get(i));
//        }
        System.out.println(CartList);
    }

    public void modifyCartList(int position, String newItem) {
        String Item = CartList.get(position);
        CartList.set(position, newItem);
        System.out.println("==============================");
        System.out.println((Item) + " has been replaced");
    }

    public void removeCartItem(int position) {
        String theItem = CartList.get(position);
        CartList.remove(position);
        System.out.println("==============================");
        System.out.println("Successfully removed " + theItem + " to the list");
    }

    public String findItem(String searchItem) {
        int position = CartList.indexOf(searchItem);
        if (position >= 0) {
            return CartList.get(position);
        }
        return null;
    }
}
