package com.gla.GenericsCollection.EcommerceSystem;

import java.util.*;

public class OrderManager {

    List<Order> orderList = new ArrayList<>();
    Set<Order> uniqueOrders = new HashSet<>();
    Queue<Order> processingQueue = new LinkedList<>();
    Stack<Order> failedOrders = new Stack<>();

    // 1. Add Orders
    public void addOrder(Order o) {
        orderList.add(o);
    }

    // 2. Remove duplicates
    public void removeDuplicates() {
        uniqueOrders.addAll(orderList);
    }

    // 3. Add to Queue
    public void prepareQueue() {
        processingQueue.addAll(uniqueOrders);
    }

    // 4. Process Orders
    public void processOrders() {

        while (!processingQueue.isEmpty()) {

            Order o = processingQueue.remove();
            System.out.println("Processing: " + o);

            // simulate failure (even orderId fail)
            if (o.getOrderId() % 2 == 0) {
                System.out.println("Failed: " + o);
                failedOrders.push(o);
            }
        }
    }

    // 5. Retry failed
    public void retryFailed() {

        System.out.println("Retrying Failed Orders:");

        while (!failedOrders.isEmpty()) {
            System.out.println("Reprocessing: " + failedOrders.pop());
        }
    }
}
