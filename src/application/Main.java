package application;

import entities.*;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(456);

        Product tv = new TV("Samsung", 1500.00, 55);
        Product fridge = new Refrigerator("Brastemp", 2500.00, 350);
        Product stove = new Stove("Electrolux", 1200.00, 4);

        cart.addProduct(tv);
        cart.addProduct(fridge);
        cart.addProduct(stove);

        System.out.println(cart.getContents());
        System.out.println("Total Price: R$" + cart.getTotalPrice());

        cart.removeProduct(tv);
        System.out.println("Após remover a TV:");
        System.out.println(cart.getContents());
        System.out.println("Total Price: R$" + cart.getTotalPrice());
    }
}
