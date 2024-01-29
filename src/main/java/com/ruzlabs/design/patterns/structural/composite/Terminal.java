package com.ruzlabs.design.patterns.structural.composite;

public class Terminal {

    public static void main(String[] args) {
        FileSystem proxy = new File("proxy");
        FileSystem decorator = new File("decorator");
        FileSystem composite = new File("composite");
        Directory structural = new Directory("structural");
        Directory designPatterns = new Directory("designPatterns");

        structural.add(proxy);
        structural.add(decorator);
        structural.add(composite);
        designPatterns.add(structural);

        designPatterns.ls();
    }
}
