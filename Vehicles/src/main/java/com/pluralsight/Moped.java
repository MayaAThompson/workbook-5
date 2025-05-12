package com.pluralsight;

public class Moped extends Vehicle{

    private boolean above49cc;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, boolean above49cc) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        this.above49cc = above49cc;
    }

    public boolean isAbove49cc() {
        return above49cc;
    }

    public void setAbove49cc(boolean above49cc) {
        this.above49cc = above49cc;
    }
}
