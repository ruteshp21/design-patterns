package com.ruzlabs.design.patterns.structural.facade;

public class ACFacade {

    private ACExternalUnit acExternalUnit;
    private ACIndoorUnit acIndoorUnit;

    public ACFacade() {
        this.acExternalUnit = new ACExternalUnit();
        this.acIndoorUnit = new ACIndoorUnit();
    }

    void acOnButtonClick() {
        acIndoorUnit.acceptUserOnCmd();
        acIndoorUnit.acceptUserTempCmd();
        acExternalUnit.checkVoltage();
        acExternalUnit.consumeNitrogen();
        acExternalUnit.startCondenser();
    }

    void acOffButtonClick() {
        acIndoorUnit.acceptUserOffCmd();
    }
}
