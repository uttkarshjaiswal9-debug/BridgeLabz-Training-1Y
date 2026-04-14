package com.gla.GenericsCollection.EcommerceSystem;

public class Order {

    private int orderId;
    private String customer;

    public Order(int orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(orderId);
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customer;
    }
}
