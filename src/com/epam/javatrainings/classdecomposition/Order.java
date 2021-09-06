package com.epam.javatrainings.classdecomposition;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Order {
    Random random = new Random();
    LocalTime orderTime;
    private final int orderNumber = 10000 + random.nextInt(89999);

    private int orderQuantity = 0;
    private static int ingredientCount = 0;
    private static double pizzaPrice = 0.0;
    private int pieceCount;

    private static void choosePizzaName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pizza name: ");
        String pizzaName = scanner.nextLine();
        Service.validatePizzaName(pizzaName);
    }

    private static void addIngredients() {
        System.out.println("Choose ingredients from list for your pizza!");
        for (Ingredients ingredients : Ingredients.values()) {
            System.out.println(ingredients + ": " + ingredients.getIngredientsPrice());
        }

        System.out.println("You can choose up to 7 ingredients");
        Scanner scanner = new Scanner(System.in);
        for (Ingredients ingredients : Ingredients.values()) {
            String ingredientName = scanner.nextLine();
            if (ingredientName.equals(ingredients)) {
                System.out.println(ingredients + " ");
                ingredientCount++;
                if (ingredientCount==7){
                    System.out.println("Full");
                }
            }else {
                System.out.println("We don't have this ingredient");
            }
        }
    }

    private static double getPrice() {
        for (Ingredients ingredients : Ingredients.values())
            pizzaPrice += ingredients.getIngredientsPrice();
        return pizzaPrice;
    }

    private static void pizzaPrice() {
        if (PizzaType.valueOf("REGULAR") == PizzaType.REGULAR) {
            addIngredients();
            double pizzaPrice = getPrice() + PizzaType.REGULAR.getBasePrice();
            System.out.println("Pizza price: " + pizzaPrice);
        } else if (PizzaType.valueOf("CALZONE") == PizzaType.CALZONE) {
            addIngredients();
            double pizzaPrice = getPrice() + PizzaType.CALZONE.getBasePrice();
            System.out.println("Pizza price: " + pizzaPrice);
        } else {
            System.out.println("We don't have this kind of pizza");
        }
    }

    public void orderPizza(Customer customer) {
        while (orderQuantity < 11) {
            orderTime = LocalTime.now();
            System.out.println("Order time: " + orderTime);
            System.out.println("Order number: " + orderNumber);
            choosePizzaName();
            pizzaPrice();
            orderQuantity++;
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }
}
