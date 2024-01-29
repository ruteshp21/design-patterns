package com.ruzlabs.design.patterns.structural.flyweight;

import java.util.Date;
import java.util.HashMap;

public class RobotCreationFactory {

    private HashMap<String, Robot> robotHashMap = new HashMap<>();

    public Robot createRobot(String type) {
        if(robotHashMap.containsKey(type)) {
            return robotHashMap.get(type);
        }
        if(type.equals("HUMANOID")) {
            Robot humanoid = new Humanoid("HUMANOID", new Date());
            robotHashMap.put(type, humanoid);
            return humanoid;
        }
        if(type.equals("ROBOTICDOG")) {
            Robot roboticDog = new Humanoid("ROBOTICDOG", new Date());
            robotHashMap.put(type, roboticDog);
            return roboticDog;
        }
        return null;
    }
}
