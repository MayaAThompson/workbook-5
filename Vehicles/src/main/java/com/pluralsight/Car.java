package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, int numberOfDoors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
