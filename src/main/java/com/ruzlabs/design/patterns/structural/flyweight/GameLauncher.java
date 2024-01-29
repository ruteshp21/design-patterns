package com.ruzlabs.design.patterns.structural.flyweight;

public class GameLauncher {

    public static void main(String[] args) {
        RobotCreationFactory robotCreationFactory = new RobotCreationFactory();
        for (int i = 0; i < 50000; i++) {
            Robot humanoid = robotCreationFactory.createRobot("HUMANOID");
            humanoid.display(i + 1, i + 1);
        }
        for (int i = 0; i < 50000; i++) {
            Robot roboticdog = robotCreationFactory.createRobot("ROBOTICDOG");
            roboticdog.display(i + 1, i + 1);
        }
    }
}
