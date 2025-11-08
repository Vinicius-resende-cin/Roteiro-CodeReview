package org.example;

public class ShoppingCart {
    int subtotal = 0;
    int shipping = 10;

    void addItem(int price) {
        this.subtotal += price;
        if (price > 50) {
            this.shipping += 5;
        }
    }

    int calculateTotal() {
        return this.subtotal + this.shipping;
    }

}
