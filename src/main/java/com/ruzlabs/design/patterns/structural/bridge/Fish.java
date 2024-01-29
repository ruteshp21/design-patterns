package com.ruzlabs.design.patterns.structural.bridge;

import com.ruzlabs.design.patterns.structural.bridge.service.BreatheImplementor;

public class Fish extends LivingThings {

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
        System.out.println("Fish Created");
    }

    @Override
    void breathProcess() {
        breatheImplementor.breatheProcess();
    }
}
