package com.workintech.compositionProject;

import com.workintech.compositionProject.enums.LampType;

public class Lamp {
    private LampType lampType;
    private boolean battery;
    private int globRating;

    public Lamp(LampType lampType, boolean battery, int globRating) {
        this.lampType = lampType;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getLampType() {
        return lampType;
    }

    public void setLampType(LampType lampType) {
        this.lampType = lampType;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle(LampType lampType){
        return this.lampType;
    }

    public int getGlobalRating(){
        return globRating;
    }


    @Override
    public String toString() {
        return "Lamp{" +
                "lampType=" + lampType +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
