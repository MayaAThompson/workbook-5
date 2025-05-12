package com.pluralsight;



public class SemiTruck extends Vehicle{

    private boolean SleeperCab;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, boolean sleeperCab) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        SleeperCab = sleeperCab;
    }

    public boolean isSleeperCab() {
        return SleeperCab;
    }

    public void setSleeperCab(boolean sleeperCab) {
        SleeperCab = sleeperCab;
    }
}
