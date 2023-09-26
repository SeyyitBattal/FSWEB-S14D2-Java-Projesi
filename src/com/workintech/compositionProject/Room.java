package com.workintech.compositionProject;

import com.workintech.compositionProject.enums.LampType;

public class Room {
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private LampType lampType;
    private Carpet carpet;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, LampType lampType, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lampType = lampType;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public LampType getLampType() {
        return lampType;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                ", lampType=" + lampType +
                ", carpet=" + carpet +
                '}';
    }
}
