package com.ruzlabs.design.patterns.structural.bridge.service;

public class LandBreatheImplementor implements BreatheImplementor {

    @Override
    public void breatheProcess() {
        System.out.println("Breath through nose");
        System.out.println("Breath Oxygen");
        System.out.println("Exhale Co2");
    }
}
