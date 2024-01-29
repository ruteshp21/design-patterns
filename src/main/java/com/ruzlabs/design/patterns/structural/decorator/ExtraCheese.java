package com.ruzlabs.design.patterns.structural.decorator;

public class ExtraCheese extends ToppingsDecorator {

    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 60;
    }
}
