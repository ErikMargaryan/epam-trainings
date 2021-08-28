package com.epam.javatrainings.classdecomposition;

import java.util.HashMap;
import java.util.HashSet;

public class Pizza {
    private static HashMap<String, Double> offeredIngredients;

    static {
        offeredIngredients = new HashMap<>();
        offeredIngredients.put("Tomato paste", 1.0);
        offeredIngredients.put("Cheese", 1.0);
        offeredIngredients.put("Salami", 1.5);
        offeredIngredients.put("Bacon", 1.2);
        offeredIngredients.put("Garlic", 0.3);
        offeredIngredients.put("Corn", 0.7);
        offeredIngredients.put("Pepperoni", 0.6);
        offeredIngredients.put("Olives", 0.5);
    }

    public static int TYPE_REGULAR = 1;
    public static int TYPE_CALZONE = 2;

    private String name;
    private int type;
    private int quantity;
    private Customer customer;
    private Order order;
    private double cost;

    private HashSet<String> ingredients;

    public Pizza(Customer customer, Order order, String name, int type, int quantity) {
        this.customer = customer;
        this.order = order;
        this.type = type;
        this.setName(name);
        this.setQuantity(quantity);

        ingredients = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 4 || name.length() > 20) {
            this.name = customer.getName() + "_" + order.getOrderNumber();
        } else {
            this.name = name;
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 10) {
            quantity = 10;
        } else if (quantity <= 0) {
            quantity = 1;
        }

        this.quantity = quantity;
    }

    public HashSet<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashSet<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean addIngredient(String ingredient) {
        if (!offeredIngredients.keySet().contains(ingredient)) {
            return false;
        }

        return ingredients.add(ingredient);
    }

    public double getCost() {
        double cost = 0;
        for (String ingredient: ingredients) {
            cost += offeredIngredients.get(ingredient);
        }

        return this.quantity * cost;
    }

    public String toString() {
        return "[" + order.getOrderNumber() + " : " + customer.getId() + ": " + name + ": " + quantity + "]";
    }
}
