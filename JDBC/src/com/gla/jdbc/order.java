package com.gla.jdbc;

class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    void calculateBill() {
        double total = baseAmount + deliveryCharge;
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Bill: " + total);
    }
}

class RegularOrder extends Order {

    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    void calculateBill() {
        double total = baseAmount + deliveryCharge;
        System.out.println("Regular Order");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Bill: " + total);
    }
}

class PremiumOrder extends Order {

    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    void calculateBill() {
        double discount = baseAmount * 0.20;
        double total = (baseAmount - discount) + deliveryCharge;

        System.out.println("Premium Order");
        System.out.println("Order ID: " + orderId);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}

