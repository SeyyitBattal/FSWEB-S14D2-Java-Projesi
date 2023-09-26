package com.workintech.compositionProject;

public class Bedroom extends Room {

    private Bed bed;
    private Wardrobe wardrobe;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, LampType lampType, Wardrobe wardrobe, Carpet carpet) {
       super(name, wall1, wall2, wall3, wall4, ceiling, lampType, carpet);
        this.bed = bed;
        this.wardrobe = wardrobe;
    }


    public Bed getBed() {
        return bed;
    }


    public Wardrobe getWardrobe() {
        return wardrobe;
    }


    @Override
    public String toString() {
        return "Bedroom{" +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                '}';
    }
}
