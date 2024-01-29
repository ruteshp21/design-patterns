package com.ruzlabs.design.patterns.structural.adapter;

public class FixScale {

    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineImpl();
        System.out.println("Weight in pounds: " + weightMachine.getWeightInPounds());
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println("Weight in kg: " + weightMachineAdapter.getWeightInKg());
    }
}
