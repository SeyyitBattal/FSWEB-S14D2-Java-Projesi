package com.workintech.compositionProject;

import com.workintech.compositionProject.enums.LampType;
import com.workintech.compositionProject.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("Living Room",
                new Wall("right"),
                new Wall("left"),
                new Wall("up"),
                new Wall("down"),
                new Ceiling(7, PaintColor.GRAY),
                LampType.LED,
                new Carpet(10, 15, PaintColor.ORANGE)
        );

        Bedroom bedroom = new Bedroom("myBedRoom",
                new Wall("right"),
                new Wall("left"),
                new Wall("up"),
                new Wall("down"),
                new Ceiling(5, PaintColor.WHITE),
                new Bed("Double", 2, 3, 1, 1),
                LampType.ACOR,
                new Wardrobe(4, 5, 240),
                new Carpet(3, 3, PaintColor.BLUE));

        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();



        System.out.println("Bedroom: " + bedroom);
        System.out.println("Living Room: " + room1);

    }
}