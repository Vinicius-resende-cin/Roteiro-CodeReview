package org.example;

public class ShoppingCart {
    int subtotal = 0;
    int shipping = 10;

    void addItem(int price) {
        this.subtotal += price;
    }

    int calculateTotal() {
        return this.subtotal + this.shipping;
    }

}
