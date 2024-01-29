package com.ruzlabs.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String name;
    private List<FileSystem> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    @Override
    public void ls() {
        System.out.println(name);
        files.forEach(FileSystem::ls);
    }

    public void add(FileSystem e) {
        files.add(e);
    }
}
