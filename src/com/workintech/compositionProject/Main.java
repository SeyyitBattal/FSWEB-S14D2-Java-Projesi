package com.workintech.compositionProject;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(bedroom);

    }
}