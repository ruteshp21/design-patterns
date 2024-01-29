package com.ruzlabs.design.patterns.structural.facade;

public class ACClient {

    public static void main(String[] args) {
        ACFacade acFacade = new ACFacade();
        acFacade.acOnButtonClick();
        acFacade.acOffButtonClick();
    }
}
