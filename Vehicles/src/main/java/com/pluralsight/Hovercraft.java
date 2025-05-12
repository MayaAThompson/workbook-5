package com.pluralsight;

public class Hovercraft extends Vehicle{

    private boolean onWater;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, boolean onWater) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        this.onWater = onWater;
    }

    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }
}
