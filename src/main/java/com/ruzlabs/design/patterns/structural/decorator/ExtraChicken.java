package com.ruzlabs.design.patterns.structural.decorator;

public class ExtraChicken extends ToppingsDecorator {

    private BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}
