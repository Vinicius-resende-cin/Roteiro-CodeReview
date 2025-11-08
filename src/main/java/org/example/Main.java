package org.example;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        System.out.println(cart.calculateTotal());
    }
}