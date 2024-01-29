package com.ruzlabs.design.patterns.structural.bridge;

import com.ruzlabs.design.patterns.structural.bridge.service.BreatheImplementor;

public class Dog extends LivingThings {

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
        System.out.println("Dog Created");
    }

    @Override
    void breathProcess() {
        breatheImplementor.breatheProcess();
    }
}
