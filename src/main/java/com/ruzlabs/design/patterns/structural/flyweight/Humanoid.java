package com.ruzlabs.design.patterns.structural.flyweight;

import java.util.Date;

public class Humanoid implements Robot {

    public String type;
    public Date date;

    public Humanoid(String type, Date date) {
        this.type = type;
        this.date = date;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("x = " + x + " y = " + y);
    }
}
