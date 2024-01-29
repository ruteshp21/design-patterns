package com.ruzlabs.design.patterns.structural.bridge;

import com.ruzlabs.design.patterns.structural.bridge.service.BreatheImplementor;

public abstract class LivingThings {

    public BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract void breathProcess();

}
