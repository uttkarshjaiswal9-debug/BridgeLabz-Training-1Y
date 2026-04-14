package com.gla.GenericsCollection.EcommerceSystem;

public class Main {

    public static void main(String[] args) {

        OrderManager manager = new OrderManager();

        manager.addOrder(new Order(1, "Aman"));
        manager.addOrder(new Order(2, "Rahul"));
        manager.addOrder(new Order(3, "Neha"));
        manager.addOrder(new Order(2, "Duplicate"));

        manager.removeDuplicates();
        manager.prepareQueue();
        manager.processOrders();
        manager.retryFailed();
    }
}
