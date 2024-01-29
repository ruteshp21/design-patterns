package com.ruzlabs.design.patterns.structural.bridge;

import com.ruzlabs.design.patterns.structural.bridge.service.BreatheImplementor;

public class Tree extends LivingThings {

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
        System.out.println("Tree Created");
    }

    @Override
    void breathProcess() {
        breatheImplementor.breatheProcess();
    }
}
