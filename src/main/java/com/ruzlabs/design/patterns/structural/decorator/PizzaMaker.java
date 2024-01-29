package com.ruzlabs.design.patterns.structural.decorator;

public class PizzaMaker {

    public static void main(String[] args) {
        BasePizza farmhouse = new Farmhouse();
        System.out.println("Farmhouse Cost: " + farmhouse.cost());
        BasePizza farmhouseWithCheese = new ExtraCheese(farmhouse);
        System.out.println("Farmhouse With Cheese Cost: " + farmhouseWithCheese.cost());

        BasePizza tornado = new Tornado();
        System.out.println("Tornado Cost: " + tornado.cost());
        BasePizza tornadoWithCheeseAndChicken = new ExtraChicken(new ExtraCheese(tornado));
        System.out.println("Tornado With Cheese and Chicken Cost: " + tornadoWithCheeseAndChicken.cost());
    }
}
