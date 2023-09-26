package com.masai;

public class FoodApp {
    public static void main(String[] args) {
        Food burger = new Food("Chicken Burger", "Fast Food", 5.99);
        Food salad = new Food("Garden Salad", "Healthy", 8.49);

        System.out.println(burger);
        System.out.println(salad);
    }
}



