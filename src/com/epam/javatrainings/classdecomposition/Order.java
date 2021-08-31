package com.epam.javatrainings.classdecomposition;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCurrentNumber = 10000;

    private int orderNumber;
    private Customer customer;
    private LocalTime localTime;

    private List<Pizza> orderItems = new ArrayList<Pizza>();

    public Order(Customer customer) {
        orderNumber = orderCurrentNumber++;
        this.customer = customer;
        this.localTime = LocalTime.now();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public List<Pizza> getOrderItems() {
        return orderItems;
    }

    public Pizza addOrderItem(String name, int type, int quantity) {
        Pizza pizza = new Pizza(name, type, quantity);
        orderItems.add(pizza);

        return pizza;
    }

    public double cost() {
        double totalCost = 0;
        for (Pizza pizza : orderItems) {
            totalCost += pizza.getCost() * pizza.getQuantity();
        }

        return totalCost;
    }
}
