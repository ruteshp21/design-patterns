package com.ruzlabs.design.patterns.structural.bridge.service;

public class WaterBreatheImplementor implements BreatheImplementor {

    @Override
    public void breatheProcess() {
        System.out.println("Breath through gills");
        System.out.println("Absorbs Oxygen");
        System.out.println("Exhale Co2");
    }
}
