package com.ruzlabs.design.patterns.structural.adapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPounds() * 2.205;
    }
}
