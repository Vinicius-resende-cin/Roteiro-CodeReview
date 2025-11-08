package org.example;

public class ShoppingCart {
    int subtotal = 0;
    int shipping = 10;

    void addItem(int price) {
        this.subtotal += price;
    }

    int calculateTotal() {
        int discountedShipping = (int)(this.shipping * 0.9);
        return this.subtotal + discountedShipping;
    }

}
