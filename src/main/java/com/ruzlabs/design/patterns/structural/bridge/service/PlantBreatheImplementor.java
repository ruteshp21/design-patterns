package com.ruzlabs.design.patterns.structural.bridge.service;

public class PlantBreatheImplementor implements BreatheImplementor {

    @Override
    public void breatheProcess() {
        System.out.println("Breath through leaves");
        System.out.println("Breath Co2");
        System.out.println("Exhale Oxygen");
    }
}
