package com.ruzlabs.design.patterns.structural.bridge;

import com.ruzlabs.design.patterns.structural.bridge.service.WaterBreatheImplementor;
import com.ruzlabs.design.patterns.structural.bridge.service.LandBreatheImplementor;
import com.ruzlabs.design.patterns.structural.bridge.service.PlantBreatheImplementor;

public class World {

    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreatheImplementor());
        dog.breathProcess();
        LivingThings fish = new Fish(new WaterBreatheImplementor());
        fish.breathProcess();
        LivingThings tree = new Tree(new PlantBreatheImplementor());
        tree.breathProcess();
    }
}
